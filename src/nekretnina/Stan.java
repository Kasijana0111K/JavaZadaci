package nekretnina;

public class Stan extends Nekretnina {
	private double cena;
	private double povrsinaPodruma;
	private double povrsinaTerase;

	public Stan(double kvadratura, String zona, String adresa, double povrsinaPodruma, double povrsinaTerase) {
		this.kvadratura = kvadratura;
		this.zona = zona;
		this.adresa = adresa;
		this.povrsinaPodruma = povrsinaPodruma;
		this.povrsinaTerase = povrsinaTerase;
	}

	@Override
	public double cena() {
		cena = cenaKvadrata() * (kvadratura + (povrsinaPodruma + povrsinaTerase) * 0.33);
		return cena;
	}

	@Override
	public String toString() {
		return "Stan [cena=" + cena() + ", povrsinaPodruma=" + povrsinaPodruma + ", povrsinaTerase=" + povrsinaTerase
				+ ", kvadratura=" + kvadratura + ", adresa=" + adresa + ", zona=" + zona + ", podaci=" + podaci + "]";
	}

}
