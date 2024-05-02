package Day03;

import java.io.IOException;

public class Demo3 {
	public static void main(String[] args) {
		
		Demo3 dm3 = new Demo3();
		dm3.p();
		System.out.println("normal flow......");
	}
	
//	Sttaic methods
	public void m() throws IOException{
		throw new IOException("device error");
	}
	
	 public void n() throws IOException{
		m();
	}
	 void p() {
		 try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	 }
	 
}
