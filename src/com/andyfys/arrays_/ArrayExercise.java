package com.andyfys.arrays_;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Andyfys
 * @version 1.0
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("金瓶梅新", 90);
        books[2] = new Book("青年文摘20年", 5);
        books[3] = new Book("java从入门到放弃", 300);
        //  普通价格排序
//        Book.bookSort(books);
        //  定制价格排序
//        Book.bookSortCustom(books, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Book bookC = (Book) o1;
//                Book bookD = (Book) o2;
//                return (bookC.getPrice() - bookD.getPrice());
//            }
//        });
        // 普通名字排序
//        Book.bookSortName(books);
        // 定制名字排序

//        Book.bookSortNameCustom(books, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Book bookC = (Book) o1;
//                Book bookD = (Book) o2;
//                return (bookC.getBookName().length() - bookD.getBookName().length());
//            }
//        });
        //
//        Arrays.sort(books, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Book book1 = (Book) o1;
//                Book book2 = (Book) o2;
//                double comVal = book1.getPrice() - book2.getPrice();
//                if (comVal > 0) {
//                    return 1;
//                } else if (comVal < 0) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });
//        System.out.println(Arrays.toString(books));
        //
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                return  book2.getBookName().length() - book1.getBookName().length();
            }
        });
        System.out.println(Arrays.toString(books));
    }
}


class Book {
    private final String bookName;
    private final int price;

    public Book(String bookName, int price) {
        this.bookName = bookName;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }

    public static void bookSort(Book[] book) {
        Book tempBook;
        for (int i = 0; i < book.length - 1; i++) {
            for (int j = 0; j < book.length - i - 1; j++) {
                if (book[j].price > book[j + 1].price) {
                    tempBook = book[j];
                    book[j] = book[j + 1];
                    book[j + 1] = tempBook;
                }
            }
        }
        System.out.println(Arrays.toString(book));
    }

    public static void bookSortCustom(Book[] book, Comparator comparator) {
        Book tempBook;
        for (int i = 0; i < book.length - 1; i++) {
            for (int j = 0; j < book.length - i - 1; j++) {
                if (comparator.compare(book[j], book[j + 1]) > 0) {
                    tempBook = book[j];
                    book[j] = book[j + 1];
                    book[j + 1] = tempBook;
                }
            }
        }
        System.out.println(Arrays.toString(book));
    }

    public static void bookSortName(Book[] book) {
        Book tempBook;
        for (int i = 0; i < book.length - 1; i++) {
            for (int j = 0; j < book.length - i - 1; j++) {
                if (book[j].bookName.length() < book[j + 1].bookName.length()) {
                    tempBook = book[j];
                    book[j] = book[j + 1];
                    book[j + 1] = tempBook;
                }
            }
        }
        System.out.println(Arrays.toString(book));
    }


    public static void bookSortNameCustom(Book[] book, Comparator comparator) {
        Book tempBook;
        for (int i = 0; i < book.length - 1; i++) {
            for (int j = 0; j < book.length - i - 1; j++) {
                if (comparator.compare(book[j], book[j + 1]) > 0) {
                    tempBook = book[j];
                    book[j] = book[j + 1];
                    book[j + 1] = tempBook;
                }
            }
        }
        System.out.println(Arrays.toString(book));
    }


}