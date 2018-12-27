package nekretnina;

public class Vlasnik {
	String ime, prezime;
	long JMBG;
	int brLicne;
	
	public Vlasnik(String ime, String prezime, long JMBG, int brLicne) {
		this.ime = ime;
		this.prezime = prezime;
		this.JMBG = JMBG;
		this.brLicne = brLicne;
	}

	@Override
	public String toString() {
		return "Vlasnik [ime=" + ime + ", prezime=" + prezime + ", JMBG=" + JMBG + ", brLicne=" + brLicne + "]";
	}
	
}
