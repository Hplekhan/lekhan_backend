package Day_02;

import java.util.Scanner;
/*
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5 
*/

public class Pattren7 {
	public static void main(String[] args) {
		System.out.println("enter the number of rows you want :");
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for (int i = 5; i <= n; i++) {
			for (int j = i-1; j < n; j--) {
				System.out.print(j + " ");
				
			}
			System.out.println();
			
		}
	}

}
