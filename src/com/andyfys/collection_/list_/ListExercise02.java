package com.andyfys.collection_.list_;

import java.util.ArrayList;

import java.util.List;

/**
 * @author Andyfys
 * @version 1.0
 */

public class ListExercise02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("红楼梦", 100, "曹雪芹"));
        list.add(new Book("西游记", 10, "吴承恩"));
        list.add(new Book("水浒传", 9, "施耐庵"));
        list.add(new Book("三国演义", 80, "罗贯中"));
        list.add(new Book("西游记", 10, "吴承恩"));
        Book.sortBookPrice(list);
        for (Object o : list) {
            System.out.println(o);
        }
    }

}
@SuppressWarnings({"all"})
class Book {
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return
                "名称='" + name + '\'' +
                        ", \t价格=" + price +
                        ", \t作者='" + author + '\'';

    }

    public static void sortBookPrice(List list) {

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {
                    //注意这里存在的问题
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }
}