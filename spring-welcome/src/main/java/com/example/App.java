package com.example;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
        Student stu = context.getBean(Student.class); 
        System.out.println( "Hello World!" );
        System.out.println(stu.name);
    }
}
