package com.andyfys.expetion_;

/**
 * @author Andyfys
 * @version 1.0
 */
public class ExceptionExercise02 {
    public static void main(String[] args) {
        System.out.println(new Father(22).getNum());
        System.out.println("hhhhh");
    }
}

class Father {
    private final int age;
    public int getNum(){
        Son son = null;
        try {
            son = new Son();
            return son.cal();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            return -1;
        }
    }
    public Father(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Son  {
    private String name;

    public int cal() {
        return  (1 / 0);
    }
}