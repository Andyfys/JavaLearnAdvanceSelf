package com.andyfys.enum_;



/**
 * @author Andyfys
 * @version 1.0
 */
public class SelfEnum01 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
    }
}
class Season{
    private final String name;
    private final String feel;

    public final  static Season SPRING = new Season("春天", "温暖");
    public final static Season SUMMER = new Season("夏天", "酷热");
    public final static Season AOTOMN = new Season("秋天", "闷热");
    public final static Season WINTER = new Season("冬天", "寒冷");

    private Season(String name, String feel) {
        this.name = name;
        this.feel = feel;
    }
    public static  Season getSpring(){
        return SPRING;
    }
    public String getName() {
        return name;
    }

    public String getFeel() {
        return feel;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", feel='" + feel + '\'' +
                '}';
    }
}