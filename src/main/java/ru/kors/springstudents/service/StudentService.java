package ru.kors.springstudents.service;

import org.springframework.stereotype.Service;
import ru.kors.springstudents.model.Student;

import java.util.Arrays;
import java.util.List;

//@Service - данная реализация плоха из-за класса. Приложение плохо поддается расширению
//public class StudentService {
//
//    public List<Student> findAllStudents(){
//        return Arrays.asList(
//                Student.builder().firstName("asd").email("asdad@asdd.ru").lastName("SAAA").age(22).build(),
//                Student.builder().firstName("KKKK").email("asdad@yandex.ru").lastName("BBBBB").age(32).build(),
//                Student.builder().firstName("SSSSS").email("dasds@dsd.com").lastName("SSSSS").age(122).build()
//        );
//    }
//
//}

//данная реализация лучше
public interface StudentService {

    List<Student> findAllStudents();

    Student createStudent(Student student);

    Student findByEmail(String email);

    Student updateStudent(Student student);

    void deleteStudent(String email);

}
