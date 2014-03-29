package com.github.jinkerry;

import com.github.jinkerry.meta.Person;
import com.google.gson.Gson;

/**
 * Created by jinfeng on 14-3-26.
 * Simple java class to json and string to java class.
 */
public class HelloGson {

    private void hello(){
        Gson gson = new Gson();
        Person person = new Person();
        person.setName("you");
        person.setAge(5);

        String str = gson.toJson(person);
        System.out.println("json str: " + str);

        String pstr = "{\"name\":\"zhao\",\"age\":10}";
        Person p = gson.fromJson(pstr, Person.class);
        System.out.println(p.getName());
        System.out.println(p.getAge());

    }

    public static void main(String[] args){
        HelloGson hg = new HelloGson();
        hg.hello();
    }
}
