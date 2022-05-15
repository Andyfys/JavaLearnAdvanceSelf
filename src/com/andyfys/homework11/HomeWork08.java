package com.andyfys.homework11;

/**
 * @author Andyfys
 * @version 1.0
 */
@SuppressWarnings({"ALL"})
public class HomeWork08 {
    public static void main(String[] args) {
        Color color = Color.BLACK;
                switch (color) {
                case RED:
                    Color.RED.show();
                    System.out.println("匹配到RED");
                break;
                case BLUE:
                    Color.BLUE.show();
                    System.out.println("匹配到BLUE");
                break;
                case BLACK:
                    Color.BLACK.show();
                    System.out.println("匹配到BLACK");
                break;
                case YELLOW:
                    Color.YELLOW.show();
                    System.out.println("匹配到YELLOW");
                break;
                case GREEN:
                    Color.GREEN.show();
                    System.out.println("匹配到GREEN");
                break;
                }
    }

}
