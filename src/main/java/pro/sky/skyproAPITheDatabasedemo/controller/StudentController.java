package pro.sky.skyproAPITheDatabasedemo.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.sky.skyproAPITheDatabasedemo.model.Student;
import pro.sky.skyproAPITheDatabasedemo.service.api.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student createStudent (@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    @GetMapping({"/id"})
    public Student getStudentById(@PathVariable Long id) {
        return studentService.findById(id).orElse(null);
    }

    @PutMapping
    public ResponseEntity <Student> editStudent(@RequestBody Student student) {
        Student foundStudent = studentService.editStudent(student);
        if (foundStudent == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(student);
    }

    @DeleteMapping({"/id"})
    public void removeStudent(@PathVariable Long id) {
        studentService.removeStudent(id);
    }

    @GetMapping("/age/eq")
    public List<Student> studentsSearchAge(@RequestParam Integer age) {
        return studentService.findByAge(age);
    }

    @GetMapping("/age/between")
    public List<Student> studentSearchAgeBetween(@RequestParam Integer from,
                                                 @RequestParam Integer to) {
        return studentService.findAllByAgeBetween(from, to);
    }
}
