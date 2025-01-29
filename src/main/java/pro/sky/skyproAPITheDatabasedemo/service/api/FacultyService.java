package pro.sky.skyproAPITheDatabasedemo.service.api;

import pro.sky.skyproAPITheDatabasedemo.model.Faculty;

import java.util.List;
import java.util.Optional;

public interface FacultyService {

    Faculty addFaculty(Faculty faculty);


    void removeFaculty(Long id);

    List<Faculty> getAllFaculty();

    Faculty editFaculty(Faculty faculty);

    Optional<Faculty> findById(Long id);

    List<Faculty> searchByColor(String color);
}
