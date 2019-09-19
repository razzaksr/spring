package mvc.dlithe.jpa.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest")// localhost:8080/rest/
public class ResourceController 
{
	@Autowired
	public ResourceCrudl crudl;
	
	//@RequestMapping(path="/list", produces= {"application/json"})
	@GetMapping(path="/list", produces= {"application/json"})
	//@ResponseBody
	public List<Resource> listAll()
	{
		return crudl.findAll();
	}
	//@RequestMapping(path="/listxml",produces = {"application/xml"})
	@GetMapping(path="/listxml",produces = {"application/xml"})
	public List<Resource> list()
	{
		return crudl.findAll();
	}
	//@RequestMapping("/read/{id}")
	@GetMapping("/read/{id}")
	public Optional<Resource> read(@PathVariable("id") Integer id)
	{
		return crudl.findById(id);
	}
	//@RequestMapping("/delete/{id}")
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id)
	{
		crudl.delete(crudl.getOne(id));
		return "deleted";
	}
	@PostMapping("/add")
	public Resource addNew(@RequestBody Resource res)
	{
		crudl.save(res);
		return res;
	}
	@DeleteMapping("/delete")
	public String deleted(@RequestBody Resource res)
	{
		String name=res.getName();
		crudl.delete(res);
		return name;
	}
	@PutMapping("/update")
	public Resource updating(@RequestBody Resource res)
	{
		crudl.save(res);
		return res;
	}
}