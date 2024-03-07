package ru.kors.springstudents.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

//@Getter
//@Setter
//@RequiredArgsConstructor
//@NoArgsConstructor
//@AllArgsConstructor
@Data
//@Builder
@Entity
@NoArgsConstructor
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    @Column(unique = true)
    private String email;
    @Transient
    private int age;

    public int getAge(){
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

}
