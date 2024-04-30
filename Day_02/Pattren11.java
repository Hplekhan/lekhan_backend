package pattrens;

import java.util.Scanner;

/*
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5  
 */
public class Pattren11 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("entre the number: ");
		int n = s.nextInt();
		 
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
