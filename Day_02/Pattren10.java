package pattrens;

import java.util.Scanner;

/* 
1 2 3 4 5 
2 3 4 5 
3 4 5 
4 5 
5  
 */ 
public class Pattren10 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("entre the number: ");
		int n = s.nextInt();
		
		for (int i = 0; i <= n; i++) {
			for (int j = i+1; j <= n; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}

}
