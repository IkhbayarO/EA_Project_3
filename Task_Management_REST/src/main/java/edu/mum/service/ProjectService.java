package edu.mum.service;

import java.util.List;

import edu.mum.domain.Project;



public interface ProjectService {
	public void save(Project project);
	public List<Project> findAll();
	public void update(Project project);
	public Project findOne(Long id);
	public Project findByProjectTitle(String title);
	public void delete(Long id);
}
