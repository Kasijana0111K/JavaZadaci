package endava;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
		        int a, b;
		        double rez = 0;
		        String op;
		 
		        System.out.print("Unesite prvi broj:");
		        a = input.nextInt();

		        System.out.print("Unesite drugi broj:");
		        b = input.nextInt();
		        System.out.print("Operacija:");
		        op = input.next();
		        	 
		        switch (op) {
				case "s":{
					rez = a + b;
					System.out.print("Rezultat je:" + rez + "\n");
				}break;
				case "o":{
					rez = a - b;
					System.out.print("Rezultat je:" + rez + "\n");
				}break;
				case "m":{
					rez = a * b;
					System.out.print("Rezultat je:" + rez + "\n");
				}break;
				case "d":
				if (b!=0) {
					rez = a / b;
				System.out.print("Rezultat je:" + rez + "\n");
				}
				else 
					System.out.print("Ne moze se deliti sa 0.");
				break;
		
				default:
					System.out.print("ERROR! Uneli ste nepostojecu operaciju!");
				}
		        
		        input.close();
		    }
	}
