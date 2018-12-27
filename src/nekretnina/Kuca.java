package nekretnina;

public class Kuca extends Nekretnina {
	private double cena;
	private double okucnica;

	public Kuca(double kvadratura, String zona, String adresa, double okucnica) {
		this.kvadratura = kvadratura;
		this.zona = zona;
		this.adresa = adresa;
		this.okucnica = okucnica;
	}

	@Override
	public double cena() {
		cena = cenaKvadrata() * (kvadratura + okucnica * 0.15);
		return cena;
	}

	@Override
	public String toString() {
		return "Kuca [cena=" + cena() + ", okucnica=" + okucnica + ", kvadratura=" + kvadratura + ", adresa=" + adresa
				+ ", podaci=" + podaci + "]";
	}

}
