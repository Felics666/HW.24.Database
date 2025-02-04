package pro.sky.skyproAPITheDatabasedemo.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pro.sky.skyproAPITheDatabasedemo.model.Student;
import pro.sky.skyproAPITheDatabasedemo.service.api.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public Student saveStudent (@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping
    public List<Student> students () {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student getStudentById (@PathVariable Long id) {
        return studentService.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById (@PathVariable Long id) {
        studentService.deleteById(id);
    }

    @GetMapping("/age/eq")
    public List<Student> searchStudentByAge (@RequestParam Integer age) {
        return studentService.findAllByAge(age);
    }

    @GetMapping("/age/between")
    public List<Student> searchStudentByAgeBetween (@RequestParam Integer from, @RequestParam Integer to) {
        return studentService.findAllByAgeBetween(from, to);
    }

}

