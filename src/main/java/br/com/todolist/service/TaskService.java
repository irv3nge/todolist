package br.com.todolist.service;


import br.com.todolist.domain.StatusEnum;
import br.com.todolist.model.Task;
import br.com.todolist.repository.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class TaskService {

    @Autowired
    Repositorio repositorio;

    StatusEnum statusEnum;


    public void deleteTask(Long id){

         repositorio.deleteById(id);
    }

    public List<Task> listarTask(){

       return repositorio.findAll();
    }

    public Task adicionarTarefa(Task tarefa) {
        tarefa.setStatusEnum(StatusEnum.PENDENTE);
        return repositorio.save(tarefa);
    }

    public Task marcarComoConcluida(Long id){
        Task tarefa = repositorio.findById(id).orElse(null);
        if (tarefa != null) {
            tarefa.setStatusEnum(StatusEnum.CONCLUIDO);
            repositorio.save(tarefa);
        }
        return tarefa;
    }

}
