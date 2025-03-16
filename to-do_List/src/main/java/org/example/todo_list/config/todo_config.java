package org.example.todo_list.config;

import org.example.todo_list.model.Todo;
import org.example.todo_list.repository.To_doRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class todo_config {

    @Bean
    CommandLineRunner commandLineRunner(To_doRespository to_doRespository) {
        return args -> {
            Todo hiking = new Todo("Mount Everest Hike", "Plan trip to Everest", false);
            Todo workout = new Todo("Morning Workout", "Do 30 minutes of exercise", false);

            to_doRespository.save(hiking);
            to_doRespository.save(workout);
        };
    }
}
