import java.util.ArrayList;

public class Restoran {
	
	private String naziv;
	private String adresa;
	private int PIB;
	ArrayList <Zaposleni> zaposleni; 
	

	public Restoran(String naziv, String adresa, int pIB,ArrayList <Zaposleni> zaposleni) {
		super();
		this.naziv = naziv;
		this.adresa = adresa;
		this.PIB = pIB;
	}

	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public int getPIB() {
		return PIB;
	}
	public void setPIB(int pIB) {
		PIB = pIB;
	}

	public void dodajZaposlenog( Zaposleni z) {
		zaposleni.add(z);
	}
	
	public void ukloniZaposlenog(Zaposleni z) {
		zaposleni.remove(z.getJedinstveniId());
	}
	
	public void pronadjiPoId(int id) {
		for( Zaposleni z : zaposleni) {
			if(z.getJedinstveniId() == id) {
				System.out.println(z.getIme());	
		}
	
	        }
		}
	
	
	public static void main(String[] args) {
		
		ArrayList<Zaposleni> lista = new ArrayList<>();
		Konobar konobar1 = new Konobar(23,"Marko", "Markovic", 12.5, 32 ,15);
		Kuvar kuvar1 = new Kuvar(2,"Milos", "Milakovic", 12.4, 40);
		Menadzer men1 =  new Menadzer(6,"Dragan", "Nikolic", 25.5, 45, 200);
		Restoran r1 = new Restoran("Astorija", "City Kvart", 123, lista);
		lista.add(konobar1);
		lista.add(men1);
		lista.add(kuvar1);
		
		for( Zaposleni z : lista) {
			System.out.println(z);
		}


	}

}
