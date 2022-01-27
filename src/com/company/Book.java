package com.company;

import java.util.Date;

public class Book {
    private String name;
    private Human author;
    private Date published;
    private String publisher;
    private int pages;

    public Book(String name, Human author, Date published, String publisher, int pages) {
        this.name = name;
        this.author = author;
        this.published = published;
        this.publisher = publisher;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getAuthor() {
        return author;
    }

    public void setAuthor(Human author) {
        this.author = author;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
