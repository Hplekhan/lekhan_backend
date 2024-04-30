package Day_02;

import java.util.Scanner;

/*  a a a a a
b b b b b
c c c c c
d d d d d
e e e e e  */
public class Pattren2 {
	public static void main(String[] args) {
		System.out.println("enter the number of rows you want :");
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		
		
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				System.out.print((char) (i+97) + " ");
			}
			System.out.println();
			
		}
	}
}
