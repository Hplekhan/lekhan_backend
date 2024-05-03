package Day03;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/* USING TREESET TO SORT STUDENT OBJECT*/
public class StudentTreeset{

	public static void main(String[] args) {

		Comparator<Employee> comp = new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				
				/* sort according to name
				return o1.getName().compareTo(o2.getName());*/
				
				/* sort according to id
				return o1.getId()-o2.getId();*/
				
				return 0;
			}
		};
	
		/*TreeSet<Employee> hs = new TreeSet<Employee>(comp);*/
		/* Normal way to sort  with using override method*/
		
	TreeSet<Employee> hs = new TreeSet<Employee>((e1,e2)-> e1.getId() - e2.getId());
	/*Second way to sort using lambda expression*/
		Scanner s = new Scanner(System.in);

		while(true) {
			System.out.println("enter id :");
			int id = s. nextInt();
			System.out.println("enter name :");
			String name = s.next();
			System.out.println("enter salaray: ");
			int sal = s.nextInt();
			hs.add(new Employee(id, name, sal));
			System.out.println("wnat to continue :");
			String res = s.next();
			if(res.equalsIgnoreCase("no")) {
				break;
			}
		}
		
		for (Employee employee : hs) {
			System.out.println(employee);
		}


	};
}
