package kursy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Kurs {

	public static void main(String[] args) throws MalformedURLException {
		
		kursy(waluty("http://rss.nbp.pl/kursy/xml2/2010/a/10a091.xml"),waluty("http://www.nbp.pl/kursy/xml/a059z170324.xml"));
	}

	public static void kursy(List<Waluta> firstList, List<Waluta> secondList) {

		try {
			FileWriter fw = new FileWriter("C:\\Users\\Daniel\\Desktop\\diff\\roznica.html");
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("<html><body>");
			bw.newLine();
			bw.write("<h2>" + firstList.get(0).getTableNameAndDate() + " z " + secondList.get(0).getTableNameAndDate()
					+ "</h2>");
			bw.newLine();
			bw.write("<table>");
			bw.write("<tr><th>Nazwa waluty</th><th>Kod waluty</th><th>Kurs Sredni</th><th>zmiana</th></tr>");
			for (int i = 0; i < firstList.size(); i++) {
				bw.write("<tr>");
				bw.write("<td>" + firstList.get(i).getNazwaWaluty() + "</td>");
				bw.write("<td>" + firstList.get(i).getKodWaluty() + "</td>");
				bw.write("<td>" + firstList.get(i).getKursSredni() + "</td>");

				float changeOverTime = secondList.get(i).getKursSredni() - firstList.get(i).getKursSredni();
				changeOverTime = Math.round(changeOverTime * 1000f) / 1000f;
				if (changeOverTime > 0) {
					bw.write("<td style=\" color:green\">");
				} else if (changeOverTime < 0) {
					bw.write("<td style=\" color:red\">");
				} else {
					bw.write("<td>");
				}

				bw.write(changeOverTime + "</td></tr>");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//
	public static List<Waluta> waluty(String adres) throws MalformedURLException {
		List<Waluta> currencyList = new ArrayList<Waluta>();

		try {
			URL urlAdres = new URL(adres);
			URLConnection connection = urlAdres.openConnection();

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = factory.newDocumentBuilder();

			Document doc = docBuilder.parse(connection.getInputStream());

			NodeList position = doc.getElementsByTagName("pozycja");
			String tableDate = doc.getElementsByTagName("data_publikacji").item(0).getTextContent();
			String tableNumber = doc.getElementsByTagName("numer_tabeli").item(0).getTextContent();

			for (int i = 0; i < position.getLength(); i++) {
				Waluta currency = new Waluta();
				Node positionNode = position.item(i);
				if (positionNode.getNodeType() == Node.ELEMENT_NODE) {
					Element elementOfPosition = (Element) positionNode;
					currency.setNazwaWaluty(getXmlContent(elementOfPosition, "nazwa_waluty"));
					currency.setPrzelicznik(getXmlContent(elementOfPosition, "przelicznik"));
					currency.setKodWaluty(getXmlContent(elementOfPosition, "kod_waluty"));
					currency.setKursSredni(getXmlContent(elementOfPosition, "kurs_sredni"));
					currency.setTableNameAndDate("tabela nr :" + tableNumber + " z dnia: " + tableDate);
				}
				currencyList.add(currency);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
		return currencyList;
	}

	public static String getXmlContent(Element elementOfPosition, String tagName) {
		return (elementOfPosition.getElementsByTagName(tagName).item(0).getTextContent());

	}
}
