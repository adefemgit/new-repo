package org.example.classic1.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository){
        return args -> {
           Student Lino =  new Student("Lino",
                            "www.partey.com",
                            LocalDate.of(1996,3,23),
                            23
            );
            Student theo  =  new Student("theo",
                    "www.theo.com",
                    LocalDate.of(1996,3,23),
                    23
            );
            studentRepository.saveAll(
                    List.of(Lino, theo)
            );
        };
    }
}

