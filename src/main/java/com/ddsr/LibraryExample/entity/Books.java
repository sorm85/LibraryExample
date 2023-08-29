package com.ddsr.LibraryExample.entity;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Books")
public class Books implements IBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;

    @Column
    private String title;

    @Column
    private String author;

    @Column
    private int publishingYear;

    public Books( String title, String author, int publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public Books(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return id == books.id && publishingYear == books.publishingYear && title.equals(books.title) && author.equals(books.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, publishingYear);
    }
}
