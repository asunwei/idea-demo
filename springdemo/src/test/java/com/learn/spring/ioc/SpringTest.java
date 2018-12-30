package com.learn.spring.ioc;

import com.alibaba.fastjson.JSONObject;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext resource = new ClassPathXmlApplicationContext( new String[]{ "spring.xml" });
        Person person = (Person) resource.getBean("person");
        person.setAge(18);
        person.setName("aa");
        System.out.println(JSONObject.toJSONString(person));
        Person person2 = (Person) resource.getBean("person");
        person2.setName("aaaa");
        person2.setAge(1111);
        System.out.println(JSONObject.toJSONString(person2));

        School s = (School)resource.getBean("school");
        s.getPerson();
    }

}
