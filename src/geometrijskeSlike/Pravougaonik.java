package geometrijskeSlike;

public class Pravougaonik extends Kvadrat {
	
	int b;
	
	public Pravougaonik() {
		super();
		b = 3;
	}
	
	public Pravougaonik(int b) {
		super();
		this.b = b;
	}
	
	public Pravougaonik(int a, int b) {
		super(a);
		this.b = b;
	}
	
	@Override
	public double obim() {
		return 2*a + 2*b;
	}
	
	@Override
	public double povrsina() {
		return a*b;
	}

	@Override
	public String toString() {
		return "Pravougaonik [obim()=" + obim() + ", povrsina()=" + povrsina() + "]";
	}
	
	
}
