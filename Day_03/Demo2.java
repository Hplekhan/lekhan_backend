package Day03;

//Array index OutOfBound
public class Demo2 {
	public static void main(String[] args) {
		try {
			int arr[] = new int[] {1,2,3,4,5};
			arr[10] = 34;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
