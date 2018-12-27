package geometrijskeSlike;
public class Krug extends GeometrijskaSlika{
	double a;
	
	public Krug() {
		a = 2.0;
	}
	
	public Krug (double a) {
		this.a = a;
	}

	@Override
	public double obim() {
		return 2*a*3.14;
	}

	@Override
	public double povrsina() {
		return a*a*3.14;
	}

	@Override
	public String toString() {
		return "Krug [obim()=" + obim() + ", povrsina()=" + povrsina() + "]";
	}
	
}
