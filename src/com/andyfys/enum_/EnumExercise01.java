package com.andyfys.enum_;

/**
 * @author Andyfys
 * @version 1.0
 */
public class EnumExercise01 {
    public static void main(String[] args) {
        System.out.println("===所有星期的信息如下===");
        WeekDay[] weekDay = WeekDay.values();
        for(WeekDay weekDay1 : weekDay){
            System.out.println(weekDay1.toString());
        }

    }
}

enum WeekDay{
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");
    private final String days;

    WeekDay(String days) {
        this.days = days;
    }

    public String getDays() {
        return days;
    }
    public void playing(){
        System.out.println("我在玩耍");
    }
    @Override
    public String toString() {
        return days;
    }
}