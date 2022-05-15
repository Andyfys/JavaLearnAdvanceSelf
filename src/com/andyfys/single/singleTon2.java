package com.andyfys.single;

public class singleTon2 {
    public static void main(String[] args) {
        Human human = Human.getInstance();
        System.out.println(human);
        People people = People.getInstance();
        System.out.println(people);
        System.out.println();

    }
}
class Human{
    //饿汉式

    private final String name;
    private final int age;

    private Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private static final Human human = new Human("jack", 22);
    public static Human getInstance(){
        return human;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class People{
    //懒汉式


    private final String name;
    private final char gender;
    private static People people;

    public People(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }
    public static People getInstance(){

        if(people == null){
            people = new People("smith", '男');
        }
        return people;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}


