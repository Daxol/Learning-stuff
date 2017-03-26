package kursy;

public class Waluta {
	private String nazwaWaluty;
	private int przelicznik;
	private String kodWaluty;
	private float kursSredni;
	private String tableNameAndDate;

	public String getTableNameAndDate() {
		return tableNameAndDate;
	}

	public void setTableNameAndDate(String tableNameAndDate) {
		this.tableNameAndDate = tableNameAndDate;
	}

	public String toString() {
		return nazwaWaluty + " " + kursSredni;
	}

	public void setNazwaWaluty(String nazwaWaluty) {
		this.nazwaWaluty = nazwaWaluty;
	}

	public void setPrzelicznik(String przelicznik) {
		this.przelicznik = Integer.parseInt(przelicznik);
	}

	public void setKodWaluty(String kodWaluty) {
		this.kodWaluty = kodWaluty;
	}

	public void setKursSredni(String kursSredni) {
		kursSredni = kursSredni.replaceAll(",", ".");
		this.kursSredni = Float.parseFloat(kursSredni);
	}

	public String getNazwaWaluty() {
		return nazwaWaluty;
	}

	public int getPrzelicznik() {
		return przelicznik;
	}

	public String getKodWaluty() {
		return kodWaluty;
	}

	public float getKursSredni() {
		return kursSredni;
	}
}
