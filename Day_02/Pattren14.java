package pattrens;

import java.util.Scanner;
/*
* 
* * 
* * * 
* * * * 
* * * * * 
*/

public class Pattren14 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("entre the number: ");
		int n = s.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
