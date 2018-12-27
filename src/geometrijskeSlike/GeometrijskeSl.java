package geometrijskeSlike;

public class GeometrijskeSl {

	public static void main(String[] args) {
		GeometrijskaSlika trougao1 = new Trougao ();
		GeometrijskaSlika trougao2 = new Nejednakostranicni (6, 3);
		GeometrijskaSlika krug = new Krug (10);
		GeometrijskaSlika elipsa = new Elipsa (6);
		GeometrijskaSlika kvadrat = new Kvadrat();
		GeometrijskaSlika pravougaonik = new Pravougaonik();
		
		System.out.println(trougao1);
		System.out.println(trougao2);
		System.out.println(krug);
		System.out.println(elipsa);
		System.out.println(kvadrat);
		System.out.println(pravougaonik);
	}
}
