package Day03;

public class Demo1 {
	public static void main(String[] args) {
		String str = "abc";
		try {		
			String s="abc";  
			int i=Integer.parseInt(s);//NumberFormatException  
		} 
		catch (NumberFormatException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
	}
}
