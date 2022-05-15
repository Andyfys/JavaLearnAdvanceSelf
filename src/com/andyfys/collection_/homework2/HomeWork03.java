package com.andyfys.collection_.homework2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Andyfys
 * @version 1.0
 */
public class HomeWork03 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("jack",650);
        hashMap.put("tom",1200);
        hashMap.put("smith",2900);
        System.out.println("hashMap=" + hashMap);
        hashMap.put("jack",2600);


        Set set = hashMap.entrySet();
        for (Object o :set) {
            Map.Entry entry = (Map.Entry) o;
            hashMap.put(entry.getKey(),(Integer)hashMap.get(entry.getKey()) + 100);
        }
        System.out.println("=====所有员工=====");
        for (Object o :set) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey());
        }
        System.out.println("=====所有工资=====");

        for (Object o : set) {
            Map.Entry set1 = (Map.Entry) o;
            System.out.println(set1.getValue());
        }
    }
    public static void raise(HashMap hashMap){
    }
}
