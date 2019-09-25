package edu.mum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.domain.Credentials;
import edu.mum.domain.Project;
import edu.mum.domain.Team;
import edu.mum.service.ProjectService;

@RestController
@RequestMapping("/projects")
public class ProjectController {
	@Autowired
	ProjectService projectService;
	
	@RequestMapping("")
	public List<Project> getAll(){
		return projectService.findAll();
	}
	@RequestMapping("/{id}")
	public Project getProject(@PathVariable("id") Long id) {
		return projectService.findOne(id);
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable Long id, @RequestBody Project project) {
		Project proj = projectService.findOne(id);
	    if (proj != null) {
	    	proj.setDescription(project.getDescription());
	    	proj.setEndDate(project.getEndDate());
	    	proj.setStartDate(project.getStartDate());
	    	proj.setTasks(project.getTasks());
	    	proj.setTeam(project.getTeam());
	    	proj.setTitle(project.getTitle());
	    } else {
	        projectService.save(project);
	        System.out.println("Credentials successfully edited!");
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
