package com.tech4me.hrworker.services;

import com.tech4me.hrworker.compartilhado.WorkerDTO;

import java.util.List;
import java.util.Optional;

public interface WorkerService {

    WorkerDTO criarWorker(WorkerDTO worker);

    List<WorkerDTO> obterTodos();

    Optional<WorkerDTO> obterPoId(String id);

    void removerWorker(String id);

    WorkerDTO atualizarWorker(String id, WorkerDTO worker);
    
}
