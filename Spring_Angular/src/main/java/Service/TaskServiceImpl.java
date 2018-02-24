package Service;

import org.h2.util.Task;
import org.springframework.stereotype.Service;

import Domain.Tasks;
import Repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {
	private TaskRepository taskrepository;
	

	
	public TaskServiceImpl( TaskRepository taskrepository) {
		
		this.taskrepository=taskrepository;
	}
	@Override
	public Iterable<Tasks> List() {
		// TODO Auto-generated method stub
		return this.taskrepository.findAll( );
	}

	
	@Override
	public Task save(Tasks task) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
