package com.andyfys.string_;


/**
 * @author Andyfys
 * @version 1.0
 */
public class HomeWork03 {
    public static void main(String[] args) {
//        System.out.println("请输入你的名字，用空格隔开");

        String name = "Willian Jefferson Clinton";
        stringFormat(name);


    }

    public static void stringFormat(String name) {
        if(name == null){
            System.out.println("字符长度不能为空");
            return;
        }
        String[] s = name.split(" ");
        if(s.length < 3){
            System.out.println("输入长度不足");
            return;
        }
        char c = s[1].toUpperCase().charAt(0);
        String names = String.format("%s,%s,%c",s[2],s[0],c);
        System.out.println(names);

    }


}
