package com.example.bookshelf.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Book implements Serializable{

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long bookId;

    public String bookTitle;
    public String bookSubtitle;
    public String bookSynopsis;
    public String Author;
    public int bookRating;
    public String bookStatus;


    public long getBookId() {
        return this.bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookSubtitle() {
        return this.bookSubtitle;
    }

    public void setBookSubtitle(String bookSubtitle) {
        this.bookSubtitle = bookSubtitle;
    }

    public String getBookSynopsis() {
        return this.bookSynopsis;
    }

    public void setBookSynopsis(String bookSynopsis) {
        this.bookSynopsis = bookSynopsis;
    }

    public String getAuthor() {
        return this.Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public int getBookRating() {
        return this.bookRating;
    }

    public void setBookRating(int bookRating) {
        this.bookRating = bookRating;
    }

    public String getBookStatus() {
        return this.bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

}
