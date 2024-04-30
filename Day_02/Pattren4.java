package Day_02;

import java.util.Scanner;

/*
A B C D E
A B C D E
A B C D E
A B C D E
A B C D E
*/	
public class PattrenFour {
	public static void main(String[] args) {
		System.out.println("enter the number of rows you want :");
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((char) (j+65) + " ");
			}
			System.out.println();
		}
	}
}
