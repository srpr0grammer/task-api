package com.codility.task.hibernate.solution.service;

import com.codility.task.hibernate.solution.model.Task;
import com.codility.task.hibernate.solution.repository.TaskRepository;
import com.codility.task.hibernate.solution.service.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task crate(Task task) {
        return taskRepository.save(task);
    }

    public Task getById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new BusinessException("Taks not found", HttpStatus.NOT_FOUND.value()));
    }

    public Task update (Task task) {
        getById(task.getId());

        return taskRepository.save(task);
    }
}
