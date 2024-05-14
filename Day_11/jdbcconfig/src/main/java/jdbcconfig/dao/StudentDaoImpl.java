package jdbcconfig.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("studentDao")
public class StudentDaoImpl implements StuddentDao {
	
	@Autowired
	public JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		String query ="insert into student (id ,name , place) values(?,?,?)";
		int i = jdbcTemplate.update(query, student.getId(), student.getName(), student.getPlace());		
		return i;
	}

	@Override
	public int updateDetails(Student student) {
		String sql ="update student set name=?,place=? where id =?";
		int i = jdbcTemplate.update(sql, student.getName(), student.getPlace(), student.getId() );
		return i;
	}

	@Override
	public int delete(int id) {
		String query =" delete from student where id=?";
		int i = jdbcTemplate.update(query, id);
		return i;
	}
	



	@Override
	public List<Student> getAllStudent() {
		
		String sql = "select * from student";
		
		RowMapper<Student> map =  new RowMapper<Student>() {
			 
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setPlace(rs.getString(3));
                return student;
            }
        };
		return jdbcTemplate.query(sql,map);
			   
	}

}
