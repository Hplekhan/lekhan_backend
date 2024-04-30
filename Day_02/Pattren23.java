package pattrens;

import java.util.Scanner;

public class Pattren23 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("entre the number: ");
		int n = s.nextInt();
		
		for (int i = 5; i <= n; i++) {
			for (int j = n-i; j>0; j--) {
				System.out.print("  ");
			}
			
			for (int j = i; j >0; j--) {
				System.out.print(j + " ");
			}

			for (int j = 4; j <=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
