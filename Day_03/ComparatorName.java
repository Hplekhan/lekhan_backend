package Day03;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparatorName{

	
	
	public static void main(String[] args) {
		List<Employee> list = new LinkedList<>();

		list.add(new Employee(1,"Jhonny",50000));
		list.add(new Employee(5,"dhoni", 60000));
		list.add(new Employee(2, "Virat", 30000));
		list.add(new Employee(4,"yuraj", 10000));
		list.add(new Employee(7,"Ruturaj", 25000));

//		FOR NAME SORT
//		Collections.sort(list, (emp1, emp2) -> emp1.getName().compareTo(emp2.getName()));
//		FOR SLARAY SORT
		Collections.sort(list, (emp2, emp1) -> emp1.getSalary() - emp2.getSalary());
//		FOR ID SORT
//		Collections.sort(list, (emp2, emp1) -> emp1.getId() - emp2.getId());
		for (Employee emp : list) {
			System.out.println(emp);
		}

	}
	
	

}
