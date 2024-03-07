package ru.kors.springstudents.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.kors.springstudents.model.Student;
import ru.kors.springstudents.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {
    //@Autowired //- устаревший метод внедрения
    private final StudentService service;

    @GetMapping
    public List<Student> findAllStudents(){

        return service.findAllStudents();

    }

    @PostMapping("save_student")
    public Student saveStudent(@RequestBody Student student){
        return service.createStudent(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email){
        return service.findByEmail(email);
    }

    @PutMapping("update_student")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(@PathVariable String email){
        service.deleteStudent(email);
    }
}
