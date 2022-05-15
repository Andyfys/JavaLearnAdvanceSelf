package com.andyfys.innerclass_;



public class InnerMemberClass {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.motivation();
//        BlackCat blackCat = new BlackCat();
//        blackCat.rob();

        Cat cat = new Cat();
        //成员内部类
        Cat.PointCat pointCat1 = cat.new PointCat();
        Cat.PointCat pointCat2 = cat.getInstance();

        new Cat().new PointCat().say();
        //静态内部类
        Cat.BigCat bigCat1 = new Cat.BigCat();
        Cat.BigCat bigCat2 = cat.getInstance2();
        bigCat2.sing();



    }
}

class Cat{
    private static final String name = "Tom";
    public class PointCat{
        private String name ;
        public void say(){
            System.out.println("说人话。。。。。");
        }
    }


    public static class BigCat{
        private final String name = "pika";
        public void sing(){
            System.out.println(Cat.name + "唱儿歌。。。。。");
        }
    }
public void getUse(){
    PointCat pointCat = new PointCat();
    pointCat.say();
}


    public PointCat getInstance(){
        return  new PointCat();

    }

    public BigCat getInstance2(){
        return  new BigCat();
    }

    public void motivation(){
        PointCat pointCat = new PointCat();
        pointCat.say();
    }
}
class BlackCat{
    public void rob(){
        new Cat().motivation();

    }
}