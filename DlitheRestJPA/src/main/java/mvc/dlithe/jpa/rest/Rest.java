package mvc.dlithe.jpa.rest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "resources", path="resources")
public interface Rest extends JpaRepository<Resource, Integer>{
	
}
