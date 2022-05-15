package com.andyfys.collection_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Andyfys
 * @version 1.0
 */
public class HashTableExercise {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        treeSet.add("jack");
        treeSet.add("jac");
        treeSet.add("ja");
        treeSet.add("j");
        System.out.println(treeSet);
    }

}
