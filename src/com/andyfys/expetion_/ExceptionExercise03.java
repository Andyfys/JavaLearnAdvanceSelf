package com.andyfys.expetion_;

import java.util.Scanner;

/**
 * @author Andyfys
 * @version 1.0
 */
public class ExceptionExercise03 {
    //当用户输入的不是一个整数就提示他反复输入，直到输入一个整数

    public static void main(String[] args) {
        Decide.methodLoop();
    }
}
class Decide{


    private Decide() {
    }

    public static void methodLoop(){
        boolean loop = true;
        int i = 0;
        do{
            try {
                System.out.println("请输入：");
                i = Integer.parseInt(new Scanner(System.in).next());
                loop = false;
            } catch (Exception e) {
                System.out.println("你输入的不是一个整数，请重新输入");
            }
        } while (loop);
        System.out.println("您输入的为一个整数=" + i);
    }
}