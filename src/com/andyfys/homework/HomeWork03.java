package com.andyfys.homework;

import java.io.*;
import java.util.Properties;

/**
 * @author Andyfys
 * @version 1.0
 * 创建一个dog.properties
 * name=tom
 * age=5
 * color=red
 * 编写Dog类，并且创建一个dog类，利用.properties配置文件完成对应初始化工作
 */
public class HomeWork03 {
    public static void main(String[] args) throws IOException {
        String filePath = "src\\dog.properties";
        String filePath2 = "e:\\dog.dat";
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;
        Properties properties = new Properties();
        properties.setProperty("name", "tom");
        properties.setProperty("age", "5");
        properties.setProperty("color", "red");
        properties.store(new FileWriter(filePath), null);
        properties.load(new InputStreamReader(new FileInputStream(filePath), "utf8"));
        Dog dog = new Dog(properties.getProperty("name"), Integer.parseInt(properties.getProperty("age")), properties.getProperty("color"));
        System.out.println(dog);
        objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath2));
        objectOutputStream.writeObject(dog);
        objectOutputStream.close();
        objectInputStream = new ObjectInputStream(new FileInputStream(filePath2));
        try {
            System.out.println(objectInputStream.readObject());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


}

class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}