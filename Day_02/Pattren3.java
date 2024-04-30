package Day_02;

import java.util.Scanner;

/*  5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1 */
public class Pattren3 {
	public static void main(String[] args) {
		
		System.out.println("enter the number of rows you want :");
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = n; j > 0; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
