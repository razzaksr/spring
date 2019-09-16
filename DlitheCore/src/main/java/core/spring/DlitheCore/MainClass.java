package core.spring.DlitheCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
	public static void main(String[] args) 
	{
		ApplicationContext app=new ClassPathXmlApplicationContext("spring.xml");
		Project p=(Project)app.getBean("trainee");
		p.info();
		p=(Project)app.getBean("trainer");
		p.info();
		/*Trainee te=(Trainee)app.getBean("trainee");
		te.info();
		Trainer tr=(Trainer)app.getBean("trainer");
		tr.info();*/
	}
}
