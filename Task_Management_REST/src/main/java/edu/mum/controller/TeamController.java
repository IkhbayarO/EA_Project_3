package edu.mum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.domain.Team;
import edu.mum.service.TeamService;
@RestController
@RequestMapping("/teams")
public class TeamController {
	@Autowired
	TeamService teamService;
	
	@RequestMapping("")
	public List<Team> getAll(){
		return teamService.findAll();
	}

}
