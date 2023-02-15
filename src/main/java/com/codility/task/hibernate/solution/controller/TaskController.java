package com.codility.task.hibernate.solution.controller;

import com.codility.task.hibernate.solution.model.Task;
import com.codility.task.hibernate.solution.model.dto.TaskRequest;
import com.codility.task.hibernate.solution.model.dto.TaskResponse;
import com.codility.task.hibernate.solution.service.TaskService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<TaskResponse> create(@Valid @RequestBody TaskRequest dto) {
        Task task = taskService.crate(modelMapper.map(dto, Task.class));

        return ResponseEntity.status(HttpStatus.CREATED).body(modelMapper.map(task, TaskResponse.class));

    }

    @PutMapping("{id}")
    public ResponseEntity<TaskResponse> update(@Valid @RequestBody TaskRequest dto, @PathVariable Long id) {
        dto.setId(id);
        Task task = taskService.update(modelMapper.map(dto, Task.class));

        return ResponseEntity.ok(modelMapper.map(task, TaskResponse.class));

    }
}
