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
import edu.mum.domain.Task;
import edu.mum.domain.Team;
import edu.mum.service.ProjectService;
import edu.mum.service.TaskService;
import edu.mum.service.TeamService;

@RestController
@RequestMapping("/projects")
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
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable("id") Long id, @RequestBody Project project) {
		Project proj = projectService.findOne(id);
	    if (proj != null) {
	    	proj.setDescription(project.getDescription());
	    	proj.setEndDate(project.getEndDate());
	    	proj.setStartDate(project.getStartDate());
	    	proj.setTasks(project.getTasks());
	    	proj.setTeam(project.getTeam());
	    	proj.setTitle(project.getTitle());
	    	projectService.save(proj);
	    	System.out.println("Updated successully!");
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
//		Team team=project.getTeam();
//		List<Task> tasks=project.getTasks();
//		
//		Team checkTeam=teamService.findOne(team.getId());
//		
//		if(checkTeam!=null) {
//			checkTeam.setProject(project);
//			teamService.save(checkTeam);
//			System.out.println("Existing team saved successfully with this project");
//		}else {
//			team.setProject(project);
//			teamService.save(team);
//			System.out.println("Team saved successfully with this project");
//		}
		
		projectService.save(project);
		System.out.println("Project successfully added!");
	}
}
