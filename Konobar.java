
public class Konobar extends Zaposleni {

	private int prekovremeniSati;
	 
    public Konobar(int id, String ime, String prezime, double plataPoSatu,
                   int brSati, int prekovremeniSati) {
        super(id, ime, prezime, plataPoSatu, brSati);
        this.prekovremeniSati = prekovremeniSati;  
    }

	public int getPrekovremeniSati() {
		return prekovremeniSati;
	}

	public void setPrekovremeniSati(int prekovremeniSati) {
		this.prekovremeniSati = prekovremeniSati;
	}

	@Override
	public double mjesecnaPlata() {
		
	        double redovno = this.getBrSati() * this.getSatnica();
	        double prekovremeno = prekovremeniSati * this.getBrSati() * 1.2;
	        return 4 * (redovno + prekovremeno);
	    }
	
	
	}
	
    

