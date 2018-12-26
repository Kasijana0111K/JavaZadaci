package geometrijskeSlike;

public class Elipsa extends Krug {
	double b;
	
	public Elipsa() {
		super();
		b = 1.0;
	}
	
	public Elipsa (double b) {
		super();
		this.b = b;
	}
	
	public Elipsa (double a, double b) {
		super(a);
		this.b = b;
	}
	
	@Override
	public double obim( ) {
		return a*3.14*(9-Math.sqrt(35))/2;
	}
	
	@Override
	public double povrsina() {
		return a*b*3.14;
	}

	@Override
	public String toString() {
		return "Elipsa [obim()=" + obim() + ", povrsina()=" + povrsina() + "]";
	}
	
}
