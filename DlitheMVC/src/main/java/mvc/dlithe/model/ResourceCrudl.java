package mvc.dlithe.model;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ResourceCrudl extends CrudRepository<Resource, Integer>{
	List<Resource> findByRole(String role);
	List<Resource> findByLpaBetween(Double lpa1,Double lpa2);
	List<Resource> findBySkill(String skill);
	@Query("from Resource where name like :pattern%")
	List<Resource> findByNameLike(String pattern);
}
