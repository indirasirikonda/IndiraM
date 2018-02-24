package Service;

import org.h2.util.Task;

import Domain.Tasks;

public interface TaskService {

	 Iterable <Tasks> List( );
	 Task save(Tasks task);
		
	
}
