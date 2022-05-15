package com.andyfys.interface_;

interface Interface02 {
    int n1 = 10;

}

class B implements Interface02 {
    protected int x = 1;
}


public class Test {
    public static void main(String[] args) {
        System.out.println(Interface02.n1);
        System.out.println(Camre.n1);
        B b = new B();
        System.out.println(B.n1);

    }
}

class C extends B {
    public void test(){
        System.out.println(super.x);
    }
}
