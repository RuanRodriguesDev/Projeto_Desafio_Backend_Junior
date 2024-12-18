package br.com.tolist.projetodevjunior.controlle;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tolist.projetodevjunior.entity.Todo;
import br.com.tolist.projetodevjunior.service.TodoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/todos")
public class TudoController {

    private TodoService todoService;

    public TudoController(TodoService todoService) {
        this.todoService = todoService;
    }
    @PostMapping
    List<Todo>create( @Valid  @RequestBody Todo todo){
        return todoService.create(todo); 
    }
    @GetMapping
    List<Todo>list(){
        return todoService.list();   
    }
   @PutMapping("/{id}")
    List<Todo>update(@RequestBody Todo todo,@PathVariable("id") Long id){
        return todoService.update(id, todo);   
    }
    @DeleteMapping("{id}")
    List<Todo>delete(@PathVariable("id") Long id){
        return todoService.delete(id); 
    }

}
