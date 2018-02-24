package Repository;

import org.springframework.data.repository.CrudRepository;

import Domain.Tasks;

public interface TaskRepository extends CrudRepository<Tasks ,Long>{

}
