package edu.mum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import edu.mum.domain.Team;

import edu.mum.service.TeamService;
@RestController
@RequestMapping("/teams")
//@PreAuthorize("hasRole('ADMIN') or hasRole('USER')")
public class TeamController {
	@Autowired
	TeamService teamService;
	
	@RequestMapping("")
	public List<Team> getAll(){
		return teamService.findAll();
	}
	
	@RequestMapping("/{id}")
	public Team getTeam(@PathVariable ("id")Long id) {
		return teamService.findOne(id);
		
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void add(@RequestBody Team team) {
		teamService.save(team);
		System.out.println("Project successfully added!");
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable("id") Long id, @RequestBody Team team) {
		Team tm = teamService.findOne(id);
		if(tm != null) {
			tm.setTeamName(team.getTeamName());
			tm.setProject(team.getProject());
			tm.setMembers(team.getMembers());
			teamService.save(tm);
		}else {
			teamService.save(team);
			System.out.println("Team Successfully updated");
		}
	}


	
	

}