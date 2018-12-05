package endava;

import java.util.Random;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c;

		Random rand = new Random();
		a = rand.nextInt(50) + 1;
		System.out.print("Unesite ceo broj do 50:");
		b = input.nextInt();
		c = Math.abs(a - b);
		if (c == 0)
			System.out.println("Neverovatno! Pogodili ste tacan broj!");
		else if (c <= 5)
			System.out.println("Dobar pokusaj, bili ste jako blizu!");
		else
			System.out.println("Vise srece sledeci put...");
		System.out.println("Tacan broj je:" + a);

		input.close();
	}

}
