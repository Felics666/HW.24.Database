package pro.sky.skyproAPITheDatabasedemo.service.api;


import pro.sky.skyproAPITheDatabasedemo.model.Faculty;
import pro.sky.skyproAPITheDatabasedemo.model.Student;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface StudentService {

    Student addStudent(Student student);

    Student editStudent(Student student);

    void removeStudent(Long id);

    List<Student> getAllStudent();

    Optional<Student> findById(Long id);

    List<Student> findByAge(Integer age);

    List<Student> findAllByAgeBetween(Integer from ,Integer to);
}
