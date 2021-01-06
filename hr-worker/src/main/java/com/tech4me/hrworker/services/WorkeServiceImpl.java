package com.tech4me.hrworker.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.tech4me.hrworker.compartilhado.WorkerDTO;
import com.tech4me.hrworker.model.Worker;
import com.tech4me.hrworker.repositories.WorkerRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkeServiceImpl implements WorkerService{
    
    @Autowired
    private WorkerRepository repo;

    @Override
    public WorkerDTO criarWorker(WorkerDTO worker) {
        return salvarPessoa(worker);
    }

    @Override
    public List<WorkerDTO> obterTodos() {
        List<Worker> workers = repo.findAll();

        return workers.stream().map(worker -> new ModelMapper().map(worker, WorkerDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public void removerWorker(String id) {
        repo.deleteById(id);
    }

    @Override
    public WorkerDTO atualizarWorker(String id, WorkerDTO worker) {
        worker.setId(id);
        return salvarPessoa(worker);
    }

    private WorkerDTO salvarPessoa(WorkerDTO worker) {
        ModelMapper mapper = new ModelMapper();
        Worker workerEntidade = mapper.map(worker, Worker.class);
        workerEntidade = repo.save(workerEntidade);

        return mapper.map(workerEntidade, WorkerDTO.class);
    }

    @Override
    public Optional<WorkerDTO> obterPoId(String id) {
        Optional<Worker> worker = repo.findById(id);

        if (worker.isPresent()) {
            return Optional.of(new ModelMapper().map(worker.get(), WorkerDTO.class));
        }

        return Optional.empty();
    }

}
