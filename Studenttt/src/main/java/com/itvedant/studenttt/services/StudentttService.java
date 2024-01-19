package com.itvedant.studenttt.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.itvedant.studenttt.dao.StudentttDAO;
import com.itvedant.studenttt.dao.UpdateStudentttDao;
import com.itvedant.studenttt.entites.Studenttt;

@Service
public class StudentttService {
	
	private Map<Integer,Studenttt> studenttts = new HashMap<>();
	
	private AtomicInteger counter = new AtomicInteger();
	
	public  Studenttt createStudenttt(StudentttDAO studentDao) {
		Studenttt studenttt = new Studenttt();
		studenttt.setId(counter.incrementAndGet());
		studenttt.setName(studentDao.getName());
		studenttt.setEmail(studentDao.getEmail());
		studenttt.setMarks(studentDao.getMarks());
		
		studenttts.put(studenttt.getId(), studenttt);
		
		return studenttt;
	
	}

	
	// To Get all the Student
			public Collection<Studenttt> getAllStudenttt(){
				return this.studenttts.values();
			}
	// To Get Student By Id	
		   public  Studenttt getAllStudentttById(Integer id) {
			   Studenttt student = this.studenttts.get(id);
			   
			   if(student == null) {
				   throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student Not Found");
			   }
			   return student;
		   
    }
		   //Delete Student
		   public String deleteStudenttt(Integer id) {
			   
			   this.studenttts.remove(id);
			   
			   return "Student Removed";
		   }
		   
		   //update particular student by id
		    public Studenttt updateStudent(UpdateStudentttDao updateStudentttDao, Integer id) {
		    	
		    	Studenttt student = this.getAllStudentttById(id);
		    	
		    	if( updateStudentttDao.getName()!= null){
		    		student.setName(updateStudentttDao.getName());
		    	}
		    	
		    	if( updateStudentttDao.getEmail()!= null) {
		    		student.setEmail(updateStudentttDao.getEmail());
		    	}
		    	
		    	if( updateStudentttDao.getMarks()!= null) {
		    		student.setMarks(updateStudentttDao.getMarks());
		    	}
		    	
		    	return student;
		    	
		    }	
		   	
		    
}