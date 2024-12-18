package br.com.tolist.projetodevjunior.repository;

import org.springframework.data.jpa.repository.JpaRepository;
;

import br.com.tolist.projetodevjunior.entity.Todo;


public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
