package edu.icet.service.impl;

import edu.icet.dto.Student;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;



    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student searchStudentById(Integer id) {
        return studentRepository.findByid(id);
    }

    @Override
    public void deleteStudentById(Integer id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> findAllStudent() {
        return studentRepository.findAll();
    }
}
