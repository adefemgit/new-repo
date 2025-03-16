package org.example.classic1;

import org.example.classic1.Student.Student;
import org.example.classic1.Student.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {{
    this.studentRepository = studentRepository;}
    }
    public List<Student> getStudent() {

        return studentRepository.findAll();

    }
}
