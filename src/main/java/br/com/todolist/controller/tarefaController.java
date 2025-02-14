package br.com.todolist.controller;


import br.com.todolist.service.TaskService;
import br.com.todolist.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarefas")
public class tarefaController {

    @Autowired
    TaskService service ;


    @GetMapping
    public List<Task> listarTask(){

       return service.listarTask();

    }

    @DeleteMapping("{id}")
    public void excluirTask(@PathVariable Long id){

        service.deleteTask(id);
    }

    @PostMapping
    public Task addTarefa(@RequestBody Task task){
       return  service.adicionarTarefa(task);
    }


    @PutMapping("/{id}/concluir")
    public ResponseEntity<Task> marcarComoConcluida(@PathVariable Long id){
        Task tarefaAtualizada = service.marcarComoConcluida(id);  

        if (tarefaAtualizada == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(tarefaAtualizada);
    }





}
