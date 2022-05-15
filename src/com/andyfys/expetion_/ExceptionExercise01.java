package com.andyfys.expetion_;

/**
 * @author Andyfys
 * @version 1.0
 */
public class ExceptionExercise01 {
    public static void main(String[] args) {
        int[] arr1 = new int[0];
        try {
            arr1 = new int[]{ 1, 2, 3, 0};
            int temp;
            for (int i = 0; i < arr1.length - 1; i++) {
                for (int j = 0; j < arr1.length - i; j++) {
                    if(arr1[j] < arr1[j + 1]){
                        temp = arr1[j + 1];
                        arr1[j + 1] = arr1[j];
                        arr1[j] = temp;
                    }
                }
            }
            System.out.println("try 中没有异常。。。");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally执行。。。");
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }


}
