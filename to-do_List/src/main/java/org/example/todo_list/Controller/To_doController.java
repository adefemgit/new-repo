package org.example.todo_list.Controller;

import org.example.todo_list.Service.TodoService;
import org.example.todo_list.model.Todo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/todos")

public class To_doController {
    public final TodoService todoService;

    public To_doController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getAllTodos(){
        return todoService.getAllTodo();
    }

    @PostMapping
    public Todo createtodo(Todo todo){
        return todoService.createtodo( todo);
    }

    @DeleteMapping("/{id}")
    public void deleteodo_byId(Long id){
        todoService.deleteById(id);
    }
}
