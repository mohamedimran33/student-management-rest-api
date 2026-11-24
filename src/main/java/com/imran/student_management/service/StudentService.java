package com.imran.student_management.service;

import com.imran.student_management.exception.StudentNotFoundException;
import com.imran.student_management.model.Student;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>();
    private Long nextId = 1L;

    public Student addStudent(Student student) {
        student.setId(nextId);
        nextId++;
        students.add(student);
        return student;
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudentById(Long id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                return students.get(i);
            }
        }
        throw new StudentNotFoundException("Student not found with:"+ id);
    }

    public Student updateStudentById(Long id, Student updatedStudent) {
        Student existingStudent = getStudentById(id);

        existingStudent.setName(updatedStudent.getName());
        existingStudent.setEmail(updatedStudent.getEmail());
        existingStudent.setAge(updatedStudent.getAge());
        existingStudent.setCourse(updatedStudent.getCourse());

        return existingStudent;
    }

    public boolean deleteStudentById(Long id) {
        Student existingStudent = getStudentById(id);
            students.remove(existingStudent);
            return true;

    }
}
