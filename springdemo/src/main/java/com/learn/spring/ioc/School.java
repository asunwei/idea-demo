package com.learn.spring.ioc;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class School {
    @Autowired
    Person person;

    public void getPerson(){
        System.out.println(JSONObject.toJSONString(person));
    }
}
