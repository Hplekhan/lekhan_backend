package Day_02;

import java.util.Scanner;
/* 
  * * * * *
  * * * *
  * * *
  * * 
  *     */

public class Pattren5 {
	public static void main(String[] args) {
		
		System.out.println("enter the number of rows you want :");
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n - i -1; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
