package pro.sky.skyproAPITheDatabasedemo.service.api;

import pro.sky.skyproAPITheDatabasedemo.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student save(Student student);

    List<Student> findAll();

    Optional<Student> findById(Long id);

    void deleteById(Long id);

    List<Student> findAllByAge(Integer age);

    List<Student> findAllByAgeBetween(Integer from, Integer to);
}
