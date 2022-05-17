package com.andyfys.generic;



import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Andyfys
 * @version 1.0
 */
public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee("jack", 15000, new MyData(10, 1, 2000));
        Employee employee2 = new Employee("smith", 1500, new MyData(2, 1, 1988));
        Employee employee3 = new Employee("milan", 200000, new MyData(8, 1, 2001));
        Employee employee4 = new Employee("jack", 10000, new MyData(10, 2, 2000));
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(!(o1 instanceof  Employee && o2 instanceof Employee)){
                    return  0;
                }

                int compare = o1.getName().compareTo(o2.getName());
                if(compare != 0){
                    return compare;
                }
                o1.getBirthday().customSort(o2.getBirthday());
                //下面的写法不容易懂--抛弃

//                if (((MyData)o1.getBirthday()).getYear() > ((MyData)o1.getBirthday()).getYear() ||
//                        ((MyData)o1.getBirthday()).getMonth() > ((MyData)o2.getBirthday()).getMonth() ||
//                        ((MyData)o1.getBirthday()).getDay() > ((MyData)o2.getBirthday()).getDay()) {
//                    return -1;
//                } else {
//                    return 1;
//                }
                return 0;
            }
        });
        for (Employee o :employees) {
            System.out.println(o);
        }

    }

}

/**
 * 定义Employee类
 * 包含 private name,sal,birthday
 * 其中birthday为MyDate类型的对象
 * MyDate类包含 private month day year
 * 自定义sort排序，匿名内部类，先测名字，再按照生日的先后顺序排
 */
class Employee {
    private String name;
    private double sal;
    private MyData birthday;

    public Employee(String name, double sal, MyData birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
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


    public MyData getBirthday() {
        return birthday;
    }

    public void setBirthday(MyData birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyData {
    private int month;
    private int day;
    private int year;

    public MyData(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }
    public  int customSort(MyData myData){
        int i = year - myData.getYear();
        if(year > myData.getYear()){
            return i;
        }
        int j = month - myData.getMonth();
        if (month > myData.getMonth()){
            return j;
        }
        int k = day - myData.getDay();
        if(day > myData.getDay()){
            return k;
        }
        return 0;
    }
}