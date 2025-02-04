package pro.sky.skyproAPITheDatabasedemo.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.skyproAPITheDatabasedemo.model.Student;
import pro.sky.skyproAPITheDatabasedemo.repositories.StudentRepository;
import pro.sky.skyproAPITheDatabasedemo.service.api.StudentService;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    public List<Student> findAllByAge(Integer age) {
        return studentRepository.findAllByAge(age);
    }

    public List<Student> findAllByAgeBetween(Integer from, Integer to) {
        return studentRepository.findAllByAgeBetween(from, to);
    }
}