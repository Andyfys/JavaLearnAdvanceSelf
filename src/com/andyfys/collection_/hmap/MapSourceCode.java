package com.andyfys.collection_.hmap;

import java.util.*;

/**
 * @author Andyfys
 * @version 1.0
 */
public class MapSourceCode {
    public static void main(String[] args) {

        HashMap hashMap = new HashMap();
        /*
            public Set<Map.Entry<K,V>> entrySet() {
                Set<Map.Entry<K,V>> es;
                return (es = entrySet) == null ? (entrySet = new EntrySet()) : es;
            }
           //创建了一个Set ————》 entrySet
         */
        /*
        使用HashMap 添加三个员工对象，要求：K为员工id V为员工对象

        并遍历显示工资大于18000的员工
        员工类： 姓名、工资、员工id
            //六大遍历方式 ：
         */
        Employee jack = new Employee("jack", 20000, "10086");
        Employee smith = new Employee("smith", 1800, "10010");
        hashMap.put(jack.getId(), jack);
        hashMap.put(smith.getId(), smith);
        System.out.println("=====第一类（1）=====");
        Set set = hashMap.keySet();
        Iterator iterator = set.iterator();
        try {
            while (iterator.hasNext()) {
                Object next =  iterator.next();
                Employee.sortEmployee(hashMap,next,"18000");
            }
        } catch (Exception e) {
            System.out.println("工资筛选格式不合法");
        }
        System.out.println("=====第一类（2）=====");
        try {
            for (Object o :set) {
                Employee.sortEmployee(hashMap,o,"18000");
            }
        } catch (Exception e) {
            System.out.println("工资筛选格式不合法");
        }

        System.out.println("=====第二类（1）=====");
        Collection values = hashMap.values();
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            Employee employee = (Employee) next;
            Employee.sortEmployee(employee,"18000");
        }
        System.out.println("=====第二类（2）=====");
        for (Object o :values) {
            Employee employee = (Employee) o;
            Employee.sortEmployee(employee,"18000");
        }
        System.out.println("=====第三类（1）=====");
        Set set1 = hashMap.entrySet();
        for (Object o :set1) {
            Map.Entry set11 = (Map.Entry) o;
            Employee value = (Employee) set11.getValue();
            Employee.sortEmployee(value,"18000");
        }
        System.out.println("=====第三类（2）=====");
        Iterator iterator2 = set1.iterator();
        while (iterator2.hasNext()) {
            Object next =  iterator2.next();
            Map.Entry next1 = (Map.Entry) next;
            Employee value = (Employee) next1.getValue();
            Employee.sortEmployee(value,"18000");
        }


    }

}

class Employee {
    private String name;
    private double sal;
    private String id;

    public Employee(String name, double sal, String id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id='" + id + '\'' +
                '}';
    }
    public static void sortEmployee(HashMap hashMap,Object obj,String salary){
        Employee employee = (Employee) (hashMap.get(obj));

            Integer integer = new Integer(salary);
            if(employee.sal > integer){
                System.out.println(employee);
            }


    }
    public static void sortEmployee(Employee employee,String salary){
        Integer integer = new Integer(salary);
        if(employee.sal > integer){
            System.out.println(employee);
        }

    }
}