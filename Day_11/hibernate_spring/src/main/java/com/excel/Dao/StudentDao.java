package com.excel.Dao;

import java.util.List;

import com.excel.entity.Student;

public interface StudentDao {
	
	public int saveStudent(Student student);
	
	public Student getStudent(int id);
	
	public List<Student> getAllStudent();
	
	public void updateStudent(Student student);
	
	public void delete(int id);
	
}
