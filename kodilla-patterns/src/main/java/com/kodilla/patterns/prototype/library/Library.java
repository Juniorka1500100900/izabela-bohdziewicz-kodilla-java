package com.kodilla.patterns.prototype.library;


import java.util.HashSet;
import java.util.Set;

public final class Library implements Cloneable {

    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book bookList : books) {
            Book clonedBooks = new Book(bookList.getTitle(), bookList.getAuthor(), bookList.getPublicationDate());
            clonedLibrary.getBooks().add(clonedBooks);
        }
        return clonedLibrary;
    }
}