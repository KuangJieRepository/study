package org.example;

import org.example.pojo.Config;
import org.example.pojo.Person;
import org.example.pojo.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: kj
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
//        Person person = xmlApplicationContext.getBean("person", Person.class);
//        System.out.println(person);
//        Student student = xmlApplicationContext.getBean("student", Student.class);
//        System.out.println(student);

//        Student student2 = xmlApplicationContext.getBean("student2", Student.class);
//        Student student3 = xmlApplicationContext.getBean("student2", Student.class);
//        System.out.println(student2);
//        System.out.println(student2 == student3);
//        student2.testAspect("kj");

        System.out.println("==================");
        Config config = xmlApplicationContext.getBean("config", Config.class);
        System.out.println(config);

    }
}