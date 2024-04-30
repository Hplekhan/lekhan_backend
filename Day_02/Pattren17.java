package pattrens;

import java.util.Scanner;

/*
  		1 
      1 0 1 
    1 0 1 0 1 
  1 0 1 0 1 0 1 
1 0 1 0 1 0 1 0 1 */
public class Pattren17 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("entre the number: ");
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i-1; j++) {
				System.out.print("  ");
			}
			
			for (int j = 0; j < 2 *i+1; j++) {
				if (j % 2 == 0) {
                  System.out.print("1 "); 
				}
               else {
                  System.out.print("0 "); 
              }
				
			}
			System.out.println();
			
		}
	}

}

