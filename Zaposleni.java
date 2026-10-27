
public class Zaposleni {

	private  int jedinstveniId;
	private String ime;
	private String prezime;
	private double satnica;
	private int brSati;
	
	
	public Zaposleni() {
		this(0,null,null,0.0,0);
	}
	
	public Zaposleni(int jedinstveniId, String ime, String prezime, double satnica, int brSati) {
		super();
		this.jedinstveniId = jedinstveniId;
		this.ime = ime;
		this.prezime = prezime;
		this.satnica = satnica;
		this.brSati = brSati;
	}
	
	
	public int getJedinstveniId() {
		return jedinstveniId;
	}
	public void setJedinstveniId(int jedinstveniId) {
		this.jedinstveniId = jedinstveniId;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public double getSatnica() {
		return satnica;
	}
	public void setSatnica(double satnica) {
		if(satnica > 00)
		this.satnica = satnica;
	}
	public int getBrSati() {
		return brSati;
	}
	public void setBrSati(int brSati) {
		if(brSati > 0)
		this.brSati = brSati;
	}

	@Override
	public String toString() {
		return "Zaposleni [jedinstveniId=" + jedinstveniId + ", ime=" + ime + ", prezime=" + prezime + ", satnica="
				+ satnica + ", brSati=" + brSati + "]";
	}
	
	public double mjesecnaPlata () {
		return 0;
	}
	
}
