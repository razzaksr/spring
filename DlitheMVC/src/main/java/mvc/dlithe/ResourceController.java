package mvc.dlithe;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
	@RequestMapping("/update/{id}")
	public ModelAndView update(@PathVariable("id") Integer id)
	{
		Resource res=crudl.findById(id).orElse(new Resource());
		res.setExp(res.getExp()+2);
		crudl.save(res);
		return new ModelAndView("index").addObject("res", res);
	}
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id)
	{
		crudl.delete(crudl.findById(id).orElse(new Resource()));
		return "deleted";
	}
	@RequestMapping("/listbyrole/{role}")
	public ModelAndView byRole(@PathVariable("role") String role)
	{
		List<Resource> res=new ArrayList<Resource>();
		crudl.findByRole(role).forEach(res::add);
		return new ModelAndView("listDlithe").addObject("all", res);
	}
	@RequestMapping("/listbybetween/{lpa1}/{lpa2}")
	public ModelAndView byBetween(@PathVariable("lpa1") Double lpa1,@PathVariable("lpa2") Double lpa2)
	{
		List<Resource> res=new ArrayList<Resource>();
		crudl.findByLpaBetween(lpa1, lpa2).forEach(res::add);
		return new ModelAndView("listDlithe").addObject("all", res);
	}
	@RequestMapping("/listbyskill/{skill}")
	public ModelAndView bySkill(@PathVariable("skill") String skill)
	{
		List<Resource> res=new ArrayList<Resource>();
		crudl.findBySkill(skill).forEach(res::add);
		return new ModelAndView("listDlithe").addObject("all", res);
	}
	@RequestMapping("/listbylike/{pattern}")
	public ModelAndView byLike(@PathVariable("pattern") String pattern)
	{
		List<Resource> res=new ArrayList<Resource>();
		crudl.findByNameLike(pattern).forEach(res::add);
		return new ModelAndView("listDlithe").addObject("all", res);
	}
}