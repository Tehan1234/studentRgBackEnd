package edu.icet.service;

import edu.icet.dto.Student;

import java.util.List;
import java.util.Optional;


public interface StudentService {

    void addStudent(Student student);

   Student searchStudentById(Integer id);

    void deleteStudentById(Integer id);

    void updateStudent(Student student);

    List<Student> findAllStudent();
}
