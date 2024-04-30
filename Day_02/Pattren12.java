package pattrens;

import java.util.Scanner;
/* 
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1 
*/
public class Pattren12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("entre the number: ");
		int n = s.nextInt();
		
		for (int i = 0; i <=n; i++) {
			for (int j = n; j > n-i ; j--) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}

}
