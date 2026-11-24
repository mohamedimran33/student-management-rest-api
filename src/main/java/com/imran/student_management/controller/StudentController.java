package com.imran.student_management.controller;

import com.imran.student_management.model.Student;
import com.imran.student_management.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService; //This prevents reassignment after construction

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> all=studentService.getAllStudents();
        return ResponseEntity.status(HttpStatus.OK).body(all);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable ("id") Long id){
        Student savedStudent= studentService.getStudentById(id);
        return ResponseEntity.status(HttpStatus.OK).body(savedStudent);
    }

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
            Student savedStudent=studentService.addStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id,@RequestBody Student student){
        Student savedStudent= studentService.updateStudentById(id,student);
        return ResponseEntity.status(HttpStatus.OK).body(savedStudent);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
