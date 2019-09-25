package edu.mum.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.TaskDao;
import edu.mum.domain.Task;
import edu.mum.service.TaskService;

@Service
@Transactional
public class TaskServiceImp implements TaskService {
	@Autowired
	private TaskDao taskDao;
	@Override
	public void save(Task task) {
		taskDao.save(task);
	}

	@Override
	public List<Task> findAll() {
		return taskDao.findAll();
	}

	@Override
	public void update(Task task) {
		taskDao.update(task);
	}

	@Override
	public Task findOne(Long id) {
		return taskDao.findOne(id);
	}

	@Override
	public Task findByTaskName(String taskName) {
		return taskDao.findByTaskName(taskName);
	}

}
