package com.andyfys.homework11;

/**
 * @author Andyfys
 * @version 1.0
 */
public class HomeWork05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }
}
class  A{
    private final String name = "smith";
    public void f1(){

        class B {
            private final String NAME = "jack";

            public void show() {
                System.out.println("他的名字是：" + A.this.name);
            }

        }
        B b = new B();
        b.show();
    }
}