package pattrens;

import java.util.Scanner;
/*
   		1 
      2 1 
    3 2 1 
  4 3 2 1 
5 4 3 2 1 
*/
public class Pattren20 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("entre the number: ");
		int n = s.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = n-i; j >0; j--) {
				System.out.print("  ");
			}
			
			for (int k = i; k >0; k--) {
				System.out.print(k+ " ");
			}
			
			System.out.println();
		}
	}
}
