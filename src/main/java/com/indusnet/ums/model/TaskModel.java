package com.indusnet.ums.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document(collection = "tasks")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskModel {
	
	
	@Id
    private Long id;

    private String title;

    private String description;

    private String assignedUser;

    private Date dueDate;

    private String completed;



   
}

