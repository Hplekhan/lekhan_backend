package Day03;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Student {

	private int id;
	private String name;
	private int age;
	private int marks;
	
	public Student(int id, String name, int age, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

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

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return this.hashCode() == other.hashCode();
	}

	public static void main(String[] args) {
		
		Set<Student> stud = new HashSet<>();
		
		Scanner s = new Scanner(System.in);

		while(true) {
			System.out.println("enter id :");
			int id = s. nextInt();
			System.out.println("enter name :");
			String name = s.next();
			System.out.println("enter age: ");
			int age = s.nextInt();
			System.out.println("entre marks: ");
			int marks = s.nextInt();
			stud.add(new Student(id, name, age, marks));
			System.out.println("want to continue :");
			String res = s.next();
			if(res.equalsIgnoreCase("no")) {
				break;
			}
		}
		
		for (Student student : stud) {
			System.out.println(student);
		}
	}
}
