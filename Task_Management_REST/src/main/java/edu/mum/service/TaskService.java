package edu.mum.service;

import java.util.List;
import edu.mum.domain.Task;

public interface TaskService {
	public void save(Task task);
	public List<Task> findAll();
	public void update(Task task);
	public Task findOne(Long id);
	public Task findByTaskName(String taskName);
}
