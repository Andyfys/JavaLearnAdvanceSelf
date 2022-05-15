package com.andyfys.string_;

/**
 * @author Andyfys
 * @version 1.0
 */
public class HomeWork04 {
    public static void main(String[] args) {
        String str = "AAaass111@";
        strCount(str);
    }

    public static void strCount(String str) {
        int upperCount = 0;
        int lowerCount = 0;
        int numCount = 0;
        int elseCount = 0;
        if (str == null) {
            System.out.println("字符串不能为空");
            return;
        }
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!(chars[i] < '0' || chars[i] > '9')) {
                numCount++;
            } else if (!(chars[i] < 'a' || chars[i] > 'z')) {
                lowerCount++;
            } else if (!(chars[i] < 'A' || chars[i] > 'Z')) {
                upperCount++;
            } else {
                elseCount++;
            }
        }
        System.out.println("共有：" + upperCount + "个大写字母\t"
                + lowerCount + "个小写字母\t" + numCount + "个数字\t" + elseCount + "个其他字符");
    }
}
