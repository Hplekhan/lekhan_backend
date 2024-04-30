package pattrens;

import java.util.Scanner;

/* 5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1*/
public class Pattren9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("entre the number: ");
		int n = s.nextInt();

		for(int i=n ; i>0 ; i--) {
			for (int j=i; j > 0; j--) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
	}


}
