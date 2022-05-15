package com.andyfys.collection_;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author Andyfys
 * @version 1.0
 */
public class LinkedListSourceCodeReview {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add(110);
        linkedList.add(120);
        linkedList.add(130);
        linkedList.remove();
        for (Object o :linkedList) {
            System.out.println(o);
        }


    }
}
