package com.andyfys.innerclass_;

public class InnerClass {
    public static void main(String[] args) {
        Dog dog = new Dog("jack", 10);
        dog.dogTest();
    }
}
class Dog{
    private final String name;
    private final int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public  void dogTest2(){
        System.out.println("狗子类内部的方法");
    }
    public void dogTest(){
        class TestBear implements Bear {

            @Override
            public void drink() {
                System.out.println("猴子会喝酒。。。。");
            }
        }
        TestBear testBear = new TestBear();
        testBear.drink();

        Person p  =  new Person(){
            @Override
            public void sing() {
                dogTest2();
                System.out.println("狗子" + name + "会唱歌。。。");
            }
        };
      p.sing();
      new Monkey(){
          private final String name = "smith";
          @Override
          public void climbing() {
              System.out.println("狗子" + Dog.this.name + "会爬树。。。");
          }
      }.climbing();
      new Animal(){

          @Override
          public void jump() {
              System.out.println("狗子\" + name + \"会跳。。。");
          }
      }.jump();
    }
}
interface Person{
    void sing();
}
interface Bear{
    void drink();
}
class Monkey{
    private String name;
    private int age;
    public void climbing(){

    }

}
abstract class Animal{
    public abstract void jump();
}