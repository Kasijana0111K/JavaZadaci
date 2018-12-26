package geometrijskeSlike;

public class Nejednakostranicni extends Trougao {
	 int b, c;
	 
	 public Nejednakostranicni() {
		super();
		b = 2;
		c = 5;
	 }
	 
	 public Nejednakostranicni(int a, int b, int c) {
		 super (a);
		 this.b = b;
		 this.c = c;
	 }

	 public Nejednakostranicni(int b, int c) {
		 super ();
		 this.b = b;
		 this.c = c;
	 }
	 
	 @Override
	 public double obim () {
		 return a + b + c;
	 }
	 
	 @Override
	 public double povrsina() {
		 double s = this.obim()/2;
		 return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	 }

	@Override
	public String toString() {
		return "Nejednakostranicni [obim()=" + obim() + ", povrsina()=" + povrsina() + "]";
	}
	 
}
