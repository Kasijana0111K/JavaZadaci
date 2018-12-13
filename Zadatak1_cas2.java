package endava;

import java.util.Scanner;

public class Zadatak1_cas2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b;
		System.out.print("Unesite manji broj ");
		a = input.nextInt();
		
		System.out.print("Unesite veci broj ");
		b = input.nextInt();
		
		int i = a + 1;
		
		while (i < b) {
			if (i % 2 == 0)
				System.out.println(i);
			i ++;
		}input.close();
	} 
}
