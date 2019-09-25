package edu.mum.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.TeamMemberDao;
import edu.mum.domain.TeamMember;
import edu.mum.service.TeamMemberService;

@Service
@Transactional
public class TeamMemberServiceImp implements TeamMemberService {
	@Autowired
	private TeamMemberDao teamMemberDao;
	@Override
	public void save(TeamMember teamMember) {
		teamMemberDao.save(teamMember);
	}

	@Override
	public List<TeamMember> findAll() {
		return teamMemberDao.findAll();
	}

	@Override
	public void update(TeamMember member) {
		teamMemberDao.update(member);
	}

	@Override
	public TeamMember findOne(Long id) {
		return teamMemberDao.findOne(id);
	}

	@Override
	public TeamMember findTeamMemberByEmail(String email) {
		return teamMemberDao.findTeamMemberByEmail(email);
	}

}
