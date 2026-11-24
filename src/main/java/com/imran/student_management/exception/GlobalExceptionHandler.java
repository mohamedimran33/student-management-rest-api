package com.imran.student_management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice  //makes this class handle exceptions across your controllers.
public class GlobalExceptionHandler {

    @ExceptionHandler(StudentNotFoundException.class) //catches this particular exception.
    public ResponseEntity<String> handleStudentNotfound(StudentNotFoundException exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }

}
