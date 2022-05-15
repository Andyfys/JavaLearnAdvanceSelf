package com.andyfys.collection_.homework2;

import java.util.ArrayList;

/**
 * @author Andyfys
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("新闻一:新冠病例超千万，数百万印度教信徒赴恒河\"圣浴\"引得民众担忧"));
        arrayList.add(new News("新闻二:男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生"));
        for (int i = arrayList.size() - 1; i >= 0 ; i--) {
            News.newsThumbnail(((News) arrayList.get(i)).getTitle());
        }
    }
}

class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }

    public static void newsThumbnail(String str) {
        if (str.length() > 15) {
            StringBuilder stringBuilder = new StringBuilder(str.substring(0, str.indexOf(":") + 16));
            System.out.println(stringBuilder.append("..."));

        }


    }
}