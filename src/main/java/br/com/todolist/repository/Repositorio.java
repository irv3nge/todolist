package br.com.todolist.repository;

import br.com.todolist.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repositorio extends JpaRepository <Task, Long> {
}
