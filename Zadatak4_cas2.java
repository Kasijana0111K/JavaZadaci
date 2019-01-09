package endava;

import java.util.Scanner;

public class Zadatak4_cas2 {

	static double sabiranje(int x, int y) {
		System.out.println("Rezultat je: " + (x + y));
		return x + y;
	}

	static double oduzimanje(int x, int y) {
		System.out.println("Rezultat je: " + (x - y));
		return x - y;
	}

	static double mnozenje(int x, int y) {
		System.out.println("Rezultat je: " + (x * y));
		return x * y;
	}

	static double deljenje(int x, int y) {
		if (y!=0) {
			System.out.println("Rezultat je: " + (double)x /(double) y);
			return (double)x / (double)y;
		}
		else 
			System.out.println("Ne moze se deliti sa 0.");
		return 0;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a, b;
		int er = 0;
		// double rez = 0;
		String op;
		while (er == 0) {
			System.out.print("Unesite prvi broj:");
			a = input.nextInt();

			System.out.print("Unesite drugi broj:");
			b = input.nextInt();
			System.out.println("Kod operacije: sabiranje S    oduzimanje O   mnozenje M  deljenje D");
			System.out.print("Unesite kod vase operacije:");
			op = input.next();

			switch (op) {
			case "S":
				sabiranje(a, b);
				break;
			case "O":
				oduzimanje(a, b);
				break;
			case "M":
				mnozenje(a, b);
				break;
			case "D":
				deljenje(a, b);
				break;

			default:
				er = 1;
				System.out.print("ERROR! Uneli ste nepostojecu operaciju!");
			}
		}

		input.close();
	}
}
