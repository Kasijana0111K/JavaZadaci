package geometrijskeSlike;
public class Kvadrat extends GeometrijskaSlika {

	int a;
	
	public Kvadrat( ) {
		a = 2;
	}
	
	public Kvadrat(int a) {
		this.a = a;
	}
	
	@Override
	public double obim() {
		return 4*a;
	}
	
	@Override
	public double povrsina() {
		return a*a;
	}

	@Override
	public String toString() {
		return "Kvadrat [obim()=" + obim() + ", povrsina()=" + povrsina() + "]";
	}

	
	}
	
