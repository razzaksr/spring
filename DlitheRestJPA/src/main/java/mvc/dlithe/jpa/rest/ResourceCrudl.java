package mvc.dlithe.jpa.rest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceCrudl extends JpaRepository<Resource, Integer>{
	
}
