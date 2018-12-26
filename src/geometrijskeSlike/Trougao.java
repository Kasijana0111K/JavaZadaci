package geometrijskeSlike;
public class Trougao extends GeometrijskaSlika {

	int a;
	
	public Trougao( ) {
		a = 4;
	}
	public Trougao(int a) {
		this.a = a;
	}
	
	@Override
	public double obim() {
		return a*3;
	}
	
	@Override
	public double povrsina() {
		return a*a*Math.sqrt(3)/4;
	}
	
	@Override
	public String toString() {
		return "Trougao [obim()=" + obim() + ", povrsina()=" + povrsina() + "]";
	}
	
	
	
}
