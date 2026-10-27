
public class Kuvar extends Zaposleni {

	private int iznos;

	public int getIznos() {
		return iznos;
	}

	public void setIznos(int iznos) {
		this.iznos = iznos;
	}

	public Kuvar(int jedinstveniId, String ime, String prezime, double satnica, int brSati) {
		super(jedinstveniId, ime, prezime, satnica, brSati);
		this.iznos = 1500;
	}

	@Override
	public double mjesecnaPlata() {
		return iznos + 4 * this.getBrSati() * this.getSatnica();		
	}
	 
	
	
}
