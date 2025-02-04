package pro.sky.skyproAPITheDatabasedemo.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.skyproAPITheDatabasedemo.model.Faculty;
import pro.sky.skyproAPITheDatabasedemo.repositories.FacultyRepository;
import pro.sky.skyproAPITheDatabasedemo.service.api.FacultyService;

import java.util.List;
import java.util.Optional;

@Service
public class FacultyServiceImpl implements FacultyService {

    private final FacultyRepository facultyRepository;

    public FacultyServiceImpl(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }


    public Faculty save(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public List<Faculty> findAll() {
        return facultyRepository.findAll();
    }

    public Optional<Faculty> findById(Long id) {
        return facultyRepository.findById(id);
    }

    public void deleteById(Long id) {
        facultyRepository.deleteById(id);
    }

    public List<Faculty> searchFacultyByColour(String colour) {
        return facultyRepository.findByColour(colour);
    }
}

