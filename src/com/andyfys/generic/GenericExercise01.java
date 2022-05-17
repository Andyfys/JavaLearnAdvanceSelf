package com.andyfys.generic;

import java.util.*;

/**
 * @author Andyfys
 * @version 1.0
 */
public class GenericExercise01 {

    public static void main(String[] args) {
        HashMap<String, Student> hashMap = new HashMap<>();
        Student jack = new Student("jack");
        Student smith = new Student("smith");
        Student milan = new Student("milan");
        hashMap.put(jack.getName(),jack);
        hashMap.put(smith.getName(),smith);
        hashMap.put(milan.getName(),milan);
        hashMap.put(milan.getName(),milan);
        Set<Map.Entry<String, Student>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("=========间隔符=============");
        for (Object o : entries) {
            Map.Entry o1 = (Map.Entry) o;
            System.out.println(o1);
        }
        HashSet<Student> students = new HashSet<Student>();
        students.add(jack);
        students.add(milan);
        students.add(smith);
        System.out.println("=========间隔符=============");
        Iterator<Student> iterator1 = students.iterator();
        while (iterator1.hasNext()) {
            Student next =  iterator1.next();
            System.out.println(next);
        }
        System.out.println("=========间隔符=============");
        for (Student student : students) {
            System.out.println(student);

        }

    }
}
class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}