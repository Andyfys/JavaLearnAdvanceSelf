package com.andyfys.final_;

public class FinalExercise01 {

    //求一个能够计算圆形的面积，三种赋值方式都写以下 要求圆周率为3.14

    public static void main(String[] args) {
        System.out.println(Circle1.getArea(2, 4));
    }
}

 final class Circle1 {
    private double radius;
    private final static double PI = 3.14;
    public static double getArea(double r, double R){
        return R * R * PI - r * r * PI;
    }
}
final class Circle2 {
    private double radius;
    private final static double PI;
    static {
        PI = 3.14;
    }
    public  double getArea(double radius){
        return radius * radius * PI;
    }
}
final class Circle3 {
    private double radius;
    private final  double PI;

    public Circle3() {
        PI = 3.14;
    }
    public  double getArea(double radius){
        return radius * radius * PI;
    }
}