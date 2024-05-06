package Day_04;

public class Employee {
	
	 Integer id;
	 String name;
	Integer salary;
	 String designation;
	
	public Employee(int id, String name, int salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ "]";
	}

}
