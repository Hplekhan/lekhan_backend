package pattrens;

import java.util.Scanner;
/*
 		1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5  
 */

public class Pattrean22 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("entre the number: ");
		int n = s.nextInt();


		for (int i = 1; i <= n; i++) {

			for (int j = n-i; j>0; j--) {
				System.out.print("  ");
			}

			for (int j = i; j >0; j--) {
				System.out.print(j + " ");
			}

			for (int j = 2; j <=i; j++) {
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}
}
