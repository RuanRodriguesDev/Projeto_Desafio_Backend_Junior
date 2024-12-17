package br.com.tolist.projetodevjunior.controlle;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tolist.projetodevjunior.entity.Todo;
import br.com.tolist.projetodevjunior.service.TodoService;

@RestController
@RequestMapping("/todos")
public class TudoController {

    private TodoService todoService;

    public TudoController(TodoService todoService) {
        this.todoService = todoService;
    }

    List<Todo>create(Todo todo){
        return todoService.create(todo); 
    }

    List<Todo>list(){
        return todoService.list();   
    }

    List<Todo>update(Todo todo){
        return todoService.update(todo);   
    }

    List<Todo>delete(Long id){
        return todoService.delete(id); 
    }

}
