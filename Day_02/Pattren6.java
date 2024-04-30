package Day_02;

import java.util.Scanner;
/*
 * *
 * * * 
 * * * * 
 * * * * * */

public class Pattren6 {
	public static void main(String[] args) {
		System.out.println("enter the number of rows you want :");
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
//		i---> Row
		for (int i = 0; i < n; i++) {
//			j--->column
			for (int j = 0; j < i+1; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

}
