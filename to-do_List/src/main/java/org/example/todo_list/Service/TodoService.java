package org.example.todo_list.Service;

import org.example.todo_list.model.Todo;
import org.example.todo_list.repository.To_doRespository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TodoService {
    private final To_doRespository to_doRespository;

    public TodoService(To_doRespository to_doRespository) {
        this.to_doRespository = to_doRespository;
    }

    public List<Todo> getAllTodo(){
        return to_doRespository.findAll();
    }

    public Todo createtodo(Todo todo){
        return to_doRespository.save(todo);
    }

    public void deleteById(Long id){
        to_doRespository.deleteById(id);
    }
}
