package com.andyfys.collection_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author Andyfys
 * @version 1.0
 */
public class TreeMapExercise {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        treeMap.put("jack", "喜羊羊");
        treeMap.put("tom", "沸羊羊");
        treeMap.put("mik", "懒羊羊");
        System.out.println(treeMap);
    }
}
