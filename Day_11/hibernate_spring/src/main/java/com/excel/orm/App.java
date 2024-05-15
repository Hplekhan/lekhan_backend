package com.excel.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.excel.Dao.StudentDao;
import com.excel.entity.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("-----------------");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/excel/orm/config.xml");


		StudentDao dao = context.getBean("stDao", StudentDao.class);

		Student st = new Student();
		st.setId(7);
		st.setName("Pant");
		st.setAddress("Delhi");

		/*Insert*/
		int i = dao.saveStudent(st); 
		System.out.println("Insert sucessfully : " + i);



		/*get by ID*/
		//		  Student s = dao.getStudent(2);  
		//		  System.out.println(s);

		/*update*/
		//		 dao.updateStudent(st);		 
		//		 System.out.println("Update Sucessfully");

		/*Delete*/
		/*dao.delete(2);*/

		/* By getting all List of Students */
		//		List<Student> list = dao.getAllStudent();
		//		for (Student sts : list) {
		//			System.out.println(sts);
		//		}

	}
}