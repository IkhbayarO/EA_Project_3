package edu.mum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.domain.Credentials;
import edu.mum.domain.Project;
import edu.mum.domain.Task;
import edu.mum.domain.Team;
import edu.mum.service.ProjectService;
import edu.mum.service.TaskService;
import edu.mum.service.TeamService;

@RestController
@RequestMapping("/projects")
//@PreAuthorize("hasRole('ADMIN') or hasRole('USER')")
public class ProjectController {
	@Autowired
	ProjectService projectService;
	@Autowired
	TeamService teamService;
	@Autowired
	TaskService taskService;
	
	@RequestMapping("")
	public List<Project> getAll(){
		return projectService.findAll();
	}
	@RequestMapping("/{id}")
	public Project getProject(@PathVariable("id") Long id) {
		return projectService.findOne(id);
	}
	
	//ask from professor
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable("id") Long id, @RequestBody Project project) {
		Project proj = projectService.findOne(id);
	    if (proj != null) {
	    	project.setId(id);
	    	projectService.save(project);
	    	System.out.println("Updated successully!");
	    } else {
	        System.out.println("There is no data with this id!");
	    }
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		Project project=projectService.findOne(id);
		
		projectService.delete(id);
		
		System.out.println("Project successfully deleted");
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void add(@RequestBody Project project) {
		
		projectService.save(project);
		System.out.println("Project successfully added!");
	}
}
