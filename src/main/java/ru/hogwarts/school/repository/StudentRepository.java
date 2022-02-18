package ru.hogwarts.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hogwarts.school.model.Student;

import java.util.Collection;



public interface StudentRepository extends JpaRepository<Student, Long> {

    Collection<Student>findStudentsByAge(int age);

}
