package edu.mum.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.ProjectDao;
import edu.mum.domain.Project;
import edu.mum.service.ProjectService;

@Service
@Transactional

public class ProjectServiceImp implements ProjectService {
	@Autowired
	private ProjectDao projectDao;
	@Override
	public void save(Project project) {
		projectDao.save(project);

	}

	@Override
	public List<Project> findAll() {
		return projectDao.findAll();
	}

	@Override
	public void update(Project project) {
		projectDao.update(project);

	}

	@Override
	public Project findOne(Long id) {
		return projectDao.findOne(id);
	}

	@Override
	public Project findByProjectTitle(String title) {
		return projectDao.findByProjectTitle(title);
	}

}
