package edu.mum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.domain.TeamMember;
import edu.mum.service.TeamMemberService;

@RestController
@RequestMapping("/teammembers")
//@PreAuthorize("hasRole('ADMIN') or hasRole('USER')")
public class TeamMemberController {
	@Autowired
	TeamMemberService memberService;
	
	@RequestMapping("")
	public List<TeamMember> getAll(){
		return memberService.findAll();
	}

}
