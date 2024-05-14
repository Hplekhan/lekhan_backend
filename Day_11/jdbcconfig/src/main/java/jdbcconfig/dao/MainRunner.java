package jdbcconfig.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainRunner {
	
	public static void main(String[] args) {
		
		ApplicationContext cxt = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		 StuddentDao dao = cxt.getBean("studentDao", StuddentDao.class);
		 
		 Student std = new Student();
		 std.setId(3);
		 std.setName("Rahul Gandhi");
		 std.setPlace("Delhi");
		 
//		 int res = dao.insert(std);
//		 System.out.println(res);
		 
//		 int rs = dao.updateDetails(new Student(1,"Rahul Gandhi", "Himachel"));
//		 System.out.println(rs);
		 
//		 int delete = dao.delete(3);
//		 System.out.println(delete);
		 
		 List<Student> list = dao.getAllStudent();
         
	        for(Student index : list) {
	            System.out.println(index);
	        }
	              
	}
	

}
