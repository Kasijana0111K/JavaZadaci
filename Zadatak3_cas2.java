package endava;

import java.util.Random;
import java.util.Scanner;

public class Zadatak3_cas2 {
	static int a, b, c, er;
    static int poredjenje(int x) {
    	
    	if (c == 0) {
    		er = 0;
			System.out.println("Neverovatno! Pogodili ste tacan broj!");
    	}
		else if (c <= 5) {
			er = 1;
			System.out.println("Dobar pokusaj, bili ste jako blizu!");
		}
		else {
			er = 2;
			System.out.println("Vise srece sledeci put...");
		}
		return er;
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		a = rand.nextInt(50) + 1;
		do {
			System.out.print("Unesite ceo broj do 50:");
			b = input.nextInt();
			c = Math.abs(a - b);
			poredjenje(b);
		}
		while (er==2);
		System.out.println("Tacan broj je:" + a);
		input.close();
	}

}
