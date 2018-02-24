package Controller;

import org.h2.util.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Domain.Tasks;
import Service.TaskService;
@RestController
@RequestMapping("api/Tasks")

public class TaskController {
	
	private TaskService taskservice;
	public TaskController (TaskService taskservice) {
		this.taskservice=taskservice;
		
	}
	@GetMapping(value = {" ", "/"})
	public Iterable<Tasks> List ( ){
		
		return this.taskservice.List ( );
	}
		@PostMapping("/save")
		public Task savetask(@RequestBody Tasks task) {
			return this.taskservice.save(task);
			
			
		}
		
		
	}
	
	
	
	


