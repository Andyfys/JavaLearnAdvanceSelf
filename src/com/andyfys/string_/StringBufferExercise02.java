package com.andyfys.string_;

import java.util.Scanner;

/**
 * @author Andyfys
 * @version 1.0
 */
public class StringBufferExercise02 {
    public static void main(String[] args) {
        String name = "哇哈哈";
        StringBuffer sb1 = new StringBuffer(name);
        String price = new Scanner(System.in).next();
        StringBuffer sb2 = new StringBuffer(price);
        String str = ".";
        boolean loop = true;
        int i = sb2.lastIndexOf(str);
        //while 循环版本  同理
        while (loop) {
            i -= 3;
            if (i > 0) {
                sb2.insert(i, ",");
            } else {
                loop = false;
            }
        }
        //for循环版本
        //解释:先获取“.”的位置，再判断其索引向前移动三位后是否还大于0，若还大于零，则insert一个逗号,否则退出循环
//        for(i ; i > 0; i -= 3){
//            sb2.insert(i,",");
//        }

        System.out.println(sb2);
        System.out.print(sb1.append("\t\t" + sb2));
    }


}
