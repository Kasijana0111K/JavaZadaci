package nekretnina;

public abstract class Nekretnina {
	double kvadratura;
	String adresa;
    String zona;
//	
	Vlasnik podaci = new Vlasnik("Pera", "Peric", 234578987, 12345);
	public abstract double cena();
	
	public double cenaKvadrata() {
		double cenaKvadrata = -1;
		switch (zona) {
		case "I":
			cenaKvadrata = 3000.0;
			break;
		case "II":
			cenaKvadrata = 2000.0;
			break;
		case "III":
			cenaKvadrata = 1000.0;
			break;
		case "IV":
			cenaKvadrata = 500.0;
			break;
		}
		return cenaKvadrata;
		
	}
}
