package com.ddsr.LibraryExample.entity;

import javax.persistence.Column;

public interface IBook {

    int id = 0;
    String title = null;
     String author = null;
     int publishingYear = 0;

    public int getId();
    public String getTitle();
    public String getAuthor();
    public int getPublishingYear();

    public void setId (int id);
    public void setPublishingYear (int publishingYear);
    public void setAuthor (String author);
    public void setTitle (String title);
    public boolean equals(Object o);
    public int hashCode();

}
