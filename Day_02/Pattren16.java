package pattrens;

import java.util.Scanner;
/* 
   		1 
      0 0 0 
    1 1 1 1 1 
  0 0 0 0 0 0 0 
1 1 1 1 1 1 1 1 1 
*/

public class Pattren16 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("entre the number: ");
		int n = s.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = n-i; j>0 ; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i*2-1 ; j++) {
				System.out.print(i%2 + " ");
			}
			System.out.println();
			
		}
	}
}
