package pattrens;

import java.util.Scanner;

/*		  1
  		1 2 1
      1 2 3 2 1 
    1 2 3 4 3 2 1
  1 2 3 4 5 4 3 2 1
 */
public class Pattrean21 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("entre the number: ");
		int n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = n-i; j>0; j--) {
				System.out.print("  ");
			}

			for (int j = 1; j < 2 *i+1; j++) {
				System.out.print(j+ " ");

			}
			System.out.println();

		}
	}
}

