package edu.icet.repository;

import edu.icet.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service

public interface StudentRepository extends JpaRepository<Student, Integer> {


    Student findByid(Integer id);
}
