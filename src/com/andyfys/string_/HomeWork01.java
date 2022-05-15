package com.andyfys.string_;

/**
 * @author Andyfys
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        String s1 = "abcdef";
        try {
            s1 = MyTools.reverse(s1, 0, 0);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(s1);
    }


}

class MyTools {
    public static String reverse(String str, int start, int end) throws RuntimeException{
        char[] cha = str.toCharArray();
        char temp;
            if(!(str != null && start >= 0  && end > start && end < str.length())){
                throw new RuntimeException("参数不正确");
            }
            for (int i = start, j = end; i < j; i++) {
                temp = cha[i];
                cha[i] = cha[j];
                cha[j] = temp;
                j--;
            }

        String s = new String(cha);
        return s;

    }
}