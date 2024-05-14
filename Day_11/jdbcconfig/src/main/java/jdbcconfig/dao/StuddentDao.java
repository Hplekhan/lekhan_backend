package jdbcconfig.dao;

import java.util.List;

public interface StuddentDao {
	
	public int insert(Student student);
	
	public int updateDetails(Student student);
	
	public int delete(int id);
	
	/*public Student getStudentById(int id);*/
	
	public List<Student> getAllStudent();

}
