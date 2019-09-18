package mvc.dlithe;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mvc.dlithe.model.Resource;
import mvc.dlithe.model.ResourceCrudl;

@Controller
@RequestMapping("/dlithe")// localhost:8080/dlithe/
public class ResourceController 
{
	@Autowired
	public ResourceCrudl crudl;
	@RequestMapping(value="/intro",method=RequestMethod.GET)
	public ModelAndView basic()
	{
		return new ModelAndView("index").addObject("data", "Dlithe Consultancy Services Pvt Ltd");
	}
	@RequestMapping(value="/create",method=RequestMethod.GET)
	public ModelAndView create()
	{
		return new ModelAndView("addNew");
	}
	@RequestMapping(value="/added",method=RequestMethod.POST)
	public ModelAndView created(Resource person)
	{
		crudl.save(person);
		return new ModelAndView("addedNew").addObject("person", person);
	}
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView list()
	{
		List<Resource> res=new ArrayList<Resource>();
		crudl.findAll().forEach(res::add);
		return new ModelAndView("listDlithe").addObject("all", res);
	}
}