package pattrens;

import java.util.Scanner;
/* 
11111
2222
333
44
5 
 */
public class Pattren8 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("entre the number: ");
		int n = s.nextInt();


		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}


