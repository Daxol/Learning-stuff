package kursy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Kurs {

	public static void main(String[] args) throws ParserConfigurationException, TransformerException {
		zmianaKursu(kursy("http://rss.nbp.pl/kursy/xml2/2010/a/10a092.xml"),
				kursy("http://www.nbp.pl/kursy/xml/a059z170324.xml"));
	}

	public static void zmianaKursu(List<Waluta> first, List<Waluta> second) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Daniel\\Desktop\\diff\\roznica.html"));
			bw.write("<html><body><table>");
			for (int i = 0; i < first.size(); i++) {
				bw.write("<tr><td>" + first.get(i).nazwaWaluty + "</td><td>" + first.get(i).kodWaluty + "</td><td>"
						+ first.get(i).kursSredni + "</td>");
				float roznica = second.get(i).kursSredni - first.get(i).kursSredni;
				roznica = (float) Math.round(roznica * 1000f) / 1000f;
				if (roznica > 0) {
					bw.write("<td  style=\"color:green\">");

				} else if (roznica < 0) {
					bw.write("<td  style=\"color:red\">");
				} else {
					bw.write("<td>");
				}

				bw.write(roznica + "</td></tr>");
				bw.newLine();
			}
			bw.write("</table></body></html>");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static List<Waluta> kursy(String adres) throws ParserConfigurationException, TransformerException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		List<Waluta> waluty = new ArrayList<Waluta>();
		try {
			URL url = new URL(adres);
			URLConnection conn = url.openConnection();
			Document doc = builder.parse(conn.getInputStream());
			
			NodeList nazwy = doc.getElementsByTagName("pozycja");
			for (int i = 0; i < nazwy.getLength(); i++) {
				Node n = nazwy.item(i);
				if (n.getNodeType() == Node.ELEMENT_NODE) {
					Element pozycja = (Element) n;
					NodeList wartosciPozycji = pozycja.getChildNodes();
					Waluta waluta = new Waluta();
					for (int j = 0; j < wartosciPozycji.getLength(); j++) {
						Node node = wartosciPozycji.item(j);
						try {
							if (node.getNodeType() == Node.ELEMENT_NODE) {
								Element element = (Element) node;
								if (element.getTagName() == "nazwa_waluty") {
									waluta.setNazwaWaluty(element.getTextContent());
								}
								if (element.getTagName() == "przelicznik") {
									waluta.setPrzelicznik(element.getTextContent());
								}
								if (element.getTagName() == "kod_waluty") {
									waluta.setKodWaluty(element.getTextContent());
								}
								if (element.getTagName() == "kurs_sredni") {
									waluta.setKursSredni(element.getTextContent());
								}
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					waluty.add(waluta);
				}

			}
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return waluty;

	}

}
