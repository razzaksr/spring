package core.spring.DlitheCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        /System.out.println( "Hello World!" );
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
        /*Furniture fun=(Furniture)context.getBean("fur1");
        System.out.println(fun);
        fun=(Furniture)context.getBean("fur2");
        System.out.println(fun);
        fun=(Furniture)context.getBean("fur3");
        System.out.println(fun);*/
        Showroom show=(Showroom)context.getBean("show");
        System.out.println(show);
    }
}
