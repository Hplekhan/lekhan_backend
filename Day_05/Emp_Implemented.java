package Day_04;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;


public class Emp_Implemented {

	public static void main(String[] args) {

	

		HashMap<Integer, Employee> map = new HashMap<>();
		Scanner s = new Scanner(System.in);
		
//		TreeSet<Employee> sort = new TreeSet<>((e1, e2)->e1.id -  e2.id);

		while(true) {
			System.out.println("enter id :");
			int id = s. nextInt();
			System.out.println("enter name :");
			String name = s.next();
			System.out.println("enter department: ");
			int sal = s.nextInt();
			System.out.println("enter designation: ");
			String desig = s.next();
			map.put(id, new Employee(id, name, sal, desig));
			
			System.out.println("wnat to continue :");
			String res = s.next();
			if(res.equalsIgnoreCase("no")) {
				break;
			}
		}
		Set<Entry<Integer, Employee>> entryset = map.entrySet();

		for (Entry<Integer, Employee> entry : entryset) {
			System.out.println(entry.getKey() + "===>" + entry.getValue());

		}

	}

}
