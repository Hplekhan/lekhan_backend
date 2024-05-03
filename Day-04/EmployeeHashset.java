package Day03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EmployeeHashset {

	private int id;
	private String name;
	private int sal;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	public EmployeeHashset(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "EmployeeHas [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		EmployeeHashset emp = (EmployeeHashset) obj;
		return this.hashCode() == emp.hashCode();

	}


	public static void main(String[] args) {

		Set<EmployeeHashset> hs = new HashSet<>();
		Scanner s = new Scanner(System.in);

		while(true) {
			System.out.println("enter id :");
			int id = s. nextInt();
			System.out.println("enter name :");
			String name = s.next();
			System.out.println("enter salaray: ");
			int sal = s.nextInt();
			hs.add(new EmployeeHashset(id, name, sal));
			System.out.println("wnat to continue :");
			String res = s.next();
			if(res.equalsIgnoreCase("no")) {
				break;
			}
		}
		
		for (EmployeeHashset emp : hs) {
			System.out.println(emp);
		}

	}


}
