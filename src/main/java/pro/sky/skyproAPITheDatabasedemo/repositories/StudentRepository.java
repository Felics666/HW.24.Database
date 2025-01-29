package pro.sky.skyproAPITheDatabasedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.skyproAPITheDatabasedemo.model.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findAllByAge(Integer age);

    List<Student> findAllByAgeBetween(Integer from ,Integer to);
}
