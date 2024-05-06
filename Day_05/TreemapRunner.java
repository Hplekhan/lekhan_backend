package Day_04;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/*Sort using string key's. we can even also use Integer instead of string*/
/*In map we can sort only for key not value*/
public class TreemapRunner {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
//		one way to sort either this or using lambda
		
//		Comparator<String> comp = new Comparator<String>() {
//			
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//		};
		
		/*Comparator<String> comp = (e1,e2)-> e1.compareTo(e2); --> either we can also pass like this*/
		
 		/*TreeMap<String, Employee> tm = new TreeMap<>((e1,e2)-> e1.compareTo(e2)); //-->lambda*/
		TreeMap<String, Employee> tm = new TreeMap<>(Comparable::compareTo); /*---> using method refference, it will automatically
		take 2 values*/
		
		while(true) {
			System.out.println("enter id :");
			int id = s. nextInt();
			System.out.println("enter name :");
			String name = s.next();
			System.out.println("enter Salary: ");
			int sal = s.nextInt();
			System.out.println("enter designation: ");
			String desig = s.next();
			/*we can give id also instead of giving name in below, so that we can change in (String, Employee)*/
			tm.put(name, new Employee(id, name, sal, desig));
			System.out.println("want to continue :");
			String res = s.next();
			if(res.equalsIgnoreCase("no")) {
				break;
			}
		}
		
		for (Entry<String, Employee> entry : tm.entrySet()) {
			String key = entry.getKey();
			Employee val = entry.getValue();
			System.out.println(entry);
			
		}
	}

}
