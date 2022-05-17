package com.andyfys.enum_;

/**
 * @author Andyfys
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class EnumKeyWord_ {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
        System.out.println(Season2.SPRING.name());
        System.out.println(Season2.SPRING.ordinal());
        Season2[] values = Season2.values();
        for(Season2 season: values){
            System.out.println(season);
        }
        //!!
        Season2 season = Season2.valueOf("SPRING");
        System.out.println(season);
        //
        System.out.println(Season2.SPRING.compareTo(Season2.WINTER));
    }
}
@SuppressWarnings({"all"})
enum Season2{
    SPRING("春天", "温暖"),
    SUMMER("夏天", "酷热"),
    AOTOMN("秋天", "闷热"),
    WINTER("冬天", "寒冷");
    private final String season;
    private final String feel;

    Season2(String season, String feel) {
        this.season = season;
        this.feel = feel;
    }

    public String getSeason() {
        return season;
    }

    public String getFeel() {
        return feel;
    }

//    @Override
//    public String toString() {
//        return "Season2{" +
//                "season='" + season + '\'' +
//                ", feel='" + feel + '\'' +
//                '}';
//    }
}