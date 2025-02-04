package pro.sky.skyproAPITheDatabasedemo.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pro.sky.skyproAPITheDatabasedemo.model.Faculty;
import pro.sky.skyproAPITheDatabasedemo.service.api.FacultyService;

import java.util.List;

@RestController
@RequestMapping("/faculty")
@AllArgsConstructor

public class FacultyController {

    private final FacultyService facultyService;

    @PostMapping
    public Faculty saveFaculty(@RequestBody Faculty faculty) {
        return facultyService.save(faculty);
    }


    @GetMapping
    public List<Faculty> getAllFaculty() {
        return facultyService.findAll();
    }

    @GetMapping("/{id}")
    public Faculty getFacultyById(@PathVariable Long id) {
        return facultyService.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteFacultyById(@PathVariable Long id) {
        facultyService.deleteById(id);
    }

    @GetMapping("/search")
    public List<Faculty> searchFacultyByColour(@RequestParam String colour) {
        return facultyService.searchFacultyByColour(colour);
    }
}

