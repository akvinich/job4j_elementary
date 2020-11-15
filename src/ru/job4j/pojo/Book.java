package ru.job4j.pojo;

public class Book {

    private String name;
    private int pagesCount;

    public Book(String name, int pagesCount) {
        this.name = name;
        this.pagesCount = pagesCount;
    }

    public String getName() {
        return name;
    }

    public int getPagesCount() {
        return pagesCount;
    }
}
