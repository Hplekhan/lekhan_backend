package pattrens;

import java.util.Scanner;
/*
   		1 
      1 2 3 
    1 2 3 4 5 
  1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 9 
 
 */

public class Pattren19 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("entre the number: ");
		int n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = n-i; j >0; j--) {
				System.out.print("  ");
				
			}
			for (int j = 1; j <= i*2 -1; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		
	}

}
