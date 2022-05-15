package com.andyfys.homework11;

/**
 * @author Andyfys
 * @version 1.0
 */
    @SuppressWarnings({"all"})
public class TextComputer {
    public static void main(String[] args) {
        new CellPhone().test(new Computer() {
            @Override
            public void work() {
                System.out.println("手机工作中");
            }
        });
    }
}
