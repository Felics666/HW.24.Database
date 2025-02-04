package pro.sky.skyproAPITheDatabasedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.skyproAPITheDatabasedemo.model.Faculty;

import java.util.List;

public interface FacultyRepository extends JpaRepository <Faculty, Long> {

    List<Faculty> findByColour(String colour);
}
