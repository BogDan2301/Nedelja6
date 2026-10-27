
public class Menadzer extends Zaposleni{

	private double osnovica;
    private double bonus;
 
    
	public double getOsnovica() {
		return osnovica;
	}

	public void setOsnovica(double osnovica) {
		this.osnovica = osnovica;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Menadzer(int jedinstveniId, String ime, String prezime, double satnica, int brSati, double bonus) {
		super(jedinstveniId, ime, prezime, satnica, brSati);
		this.osnovica = 1300;
		this.bonus = bonus;
	}

	@Override
    public double mjesecnaPlata() {
        return osnovica + 4 * this.getBrSati() * this.getSatnica() + bonus;
    }
	
	
}
