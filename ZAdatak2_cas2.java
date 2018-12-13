package endava;

import java.util.Scanner;

public class ZAdatak2_cas2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, i;
		int k = 0;
		int max = 0; 
		
		System.out.print("Uneti broj studenata ");
		n = input.nextInt();
		
		String[][] list = new String[n][2];
		for (i=0; i<n; i++) {
			System.out.print("Uneti ime studenta: ");
			list[i][0]= input.next();
			System.out.print("Uneti broj poena: ");
			list[i][1]=input.next();
			if(max <= Integer.parseInt(list[i][1])) {
				max = Integer.parseInt(list[i][1]);
				k=i;
			}
		}input.close();
			System.out.print("Sudent sa najvecim brojem poena je: " + list[k][0] + " a njegov broj poena je " + list[k][1]);

	}
}
