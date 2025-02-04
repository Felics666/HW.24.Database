package pro.sky.skyproAPITheDatabasedemo.service.api;

import pro.sky.skyproAPITheDatabasedemo.model.Faculty;

import java.util.List;
import java.util.Optional;

public interface FacultyService  {

    Faculty save(Faculty faculty);

    List<Faculty> findAll();

    Optional<Faculty> findById(Long id);

    void deleteById(Long id);

    List<Faculty> searchFacultyByColour(String colour);
}
