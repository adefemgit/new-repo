package org.example.todo_list.repository;

import org.example.todo_list.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface To_doRespository extends JpaRepository<Todo, Long> {
}
