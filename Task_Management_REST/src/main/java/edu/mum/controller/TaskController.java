package edu.mum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.domain.Task;
import edu.mum.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	
	@Autowired
	TaskService taskService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Task> getAll(){
		return taskService.findAll();
	}
	
	@RequestMapping("/{id}")
	public Task getTask(@PathVariable("id") Long id) {
		return taskService.findOne(id);
	}
}
