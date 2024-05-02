package Day03;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparableSort {
	
	public static void main(String[] args) {
		List<Employee> list = new LinkedList<>();
		
		list.add(new Employee(1,"Jhonny",50000));
		list.add(new Employee(5,"dhoni", 60000));
		list.add(new Employee(2, "Virat", 30000));
		list.add(new Employee(4,"yuraj", 10000));
		list.add(new Employee(7,"Ruturaj", 25000));
		
		Collections.sort(list);
		for (Employee emp : list) {
			System.out.println(emp);
		}
	}

}
