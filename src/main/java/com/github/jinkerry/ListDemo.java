package com.github.jinkerry;

import com.github.jinkerry.meta.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinfeng on 14-3-26.
 */
public class ListDemo {

    private Gson gson = new Gson();

    private void array() {
        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < 3; i++) {
            Person p = new Person();
            p.setName("name_" + i);
            p.setAge(i * 5);
            persons.add(p);
        }
        String str = gson.toJson(persons);
        System.out.println("array: " + str);


        List<Person> ps = gson.fromJson(str, new TypeToken<List<Person>>(){}.getType());
        for (int i = 0; i < ps.size(); i++) {
            Person p = ps.get(i);
            System.out.println(p.toString());
        }


    }

    public static void main(String[] args) {
        ListDemo list = new ListDemo();
        list.array();
    }
}
