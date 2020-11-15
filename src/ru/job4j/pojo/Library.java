package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {

        Book[] booksStore = {new Book("Clean code", 300),
                new Book("Spring in action", 800), new Book("Simple Python", 425),
                new Book("English. Step by step", 970)};
        for (int index = 0; index < booksStore.length; index++) {
            System.out.println("Книга " + booksStore[index].getName() + ", количество страниц - "
                    + booksStore[index].getPagesCount());
        }
        Book bookWithIndexNull = booksStore[0];
        booksStore[0] = booksStore[3];
        booksStore[3] = bookWithIndexNull;
        System.out.println("--------------\nAfter replace:");
        for (int index = 0; index < booksStore.length; index++) {
            System.out.println("Книга " + booksStore[index].getName() + ", количество страниц - "
                    + booksStore[index].getPagesCount());
        }
        System.out.println("--------------\nOnly 'Clean code' books:");
        for (int index = 0; index < booksStore.length; index++) {
            if (booksStore[index].getName().equals("Clean code"))
            System.out.println("Книга " + booksStore[index].getName() + ", количество страниц - "
                    + booksStore[index].getPagesCount());
        }
    }
}
