package com.sinieco.myrecyclerview;

/**
 * Created by BaiMeng on 2017/6/21.
 */
public class MyItem {
    public String title ;
    public String name ;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyItem{" +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
