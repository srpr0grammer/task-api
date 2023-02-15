package com.codility.task.hibernate.solution.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskRequest {

    private Long id;

    @NotNull(message = "This field cannot be null")
    private String description;

    @NotNull(message = "This field cannot be null")
    private Integer priority;
}
