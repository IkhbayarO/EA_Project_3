package edu.mum.service;

import java.util.List;

import edu.mum.domain.TeamMember;

public interface TeamMemberService {
	
	public void save(TeamMember teamMember);
	public List<TeamMember> findAll();
	public void update(TeamMember member);
	public TeamMember findOne(Long id);
	public TeamMember findTeamMemberByEmail(String email);
}
