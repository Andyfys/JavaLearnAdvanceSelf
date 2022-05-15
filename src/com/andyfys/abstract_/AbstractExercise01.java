package com.andyfys.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        CommonEmployee commonEmployee = new CommonEmployee("jack", "110", 1000);
        Manager manager = new Manager("smith", "120", 20000);
        commonEmployee.work();
        manager.work();
    }
}

abstract class Employee {

    private String name;
    private String id;
    private double sal;

    public Employee(String name, String id, double sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public abstract void work();
}

class CommonEmployee extends Employee {
    public CommonEmployee(String name, String id, double sal) {
        super(name, id, sal);
    }

    public void work() {
        System.out.println("普通员工" + getName() + "在工作中。。。。");
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, String id, double sal) {
        super(name, id, sal);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("经理" + getName() + "在工作中。。。。");
    }
}