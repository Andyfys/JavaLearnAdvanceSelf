package com.andyfys.junit_;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author Andyfys
 * @version 1.0
 */
public class HomeWork01 {

    public static void main(String[] args) {


    }

    @Test
    public void Junit_() {
        DAO<User> userDAO = new DAO<>();
        userDAO.save("001", new User(1, 22, "jack"));
        userDAO.save("002", new User(2, 17, "milan"));
        System.out.println("=========");
        System.out.println(userDAO.get("001"));
        userDAO.update("001", new User(1, 10, "smith"));
        System.out.println("=========");
        for (User user : userDAO.list()) {
            System.out.println(user);
        }
    }
}

class DAO<T> {
    private Map<String, T> map = new HashMap<>();


    public void save(String id, T entity) {
        map.put(id, entity);
    }


    public T get(String id) {
        return map.get(id);
    }


    public void update(String id, T entity) {
        map.put(id, entity);
    }


    public List<T> list() {
        List<T> ts = new ArrayList<>();
        Set<String> strings = map.keySet();
        for (String s : strings) {
            ts.add(get(s));
        }

        return ts;
    }

    public void delete(String id) {
        map.remove(id);
    }


}

class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


}
