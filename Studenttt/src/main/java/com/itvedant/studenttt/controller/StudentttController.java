package com.itvedant.studenttt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itvedant.studenttt.dao.StudentttDAO;
import com.itvedant.studenttt.dao.UpdateStudentttDao;
import com.itvedant.studenttt.services.StudentttService;

@RestController
@RequestMapping("/studenttts")
public class StudentttController {
	
	@Autowired
	StudentttService studentttService;
	
	// Status Code
	// Header
	// Body
	@PostMapping("/add")
	public ResponseEntity<?> create(@RequestBody StudentttDAO studenttDao){
		return ResponseEntity.ok(this.studentttService.createStudenttt(studenttDao));
	}
	@GetMapping("")
	public ResponseEntity<?> getAll(){
		return ResponseEntity.ok(this.studentttService.getAllStudenttt());
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getByID(@PathVariable("id") Integer id){
		return ResponseEntity.ok(this.studentttService.getAllStudentttById(id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Integer id){
		return ResponseEntity.ok(this.studentttService.deleteStudenttt(id));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody UpdateStudentttDao updateStudentttDao, @PathVariable("id") Integer id){
		return ResponseEntity.ok(this.studentttService.updateStudent(updateStudentttDao, id));
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<?> update1(@RequestBody UpdateStudentttDao updateStudentttDao, @PathVariable("id") Integer id){
		return ResponseEntity.ok(this.studentttService.updateStudent(updateStudentttDao, id));
	}

}