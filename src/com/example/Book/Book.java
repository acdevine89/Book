package com.example.Book;

public class Book {

    private String title;
    private String author;
    private int numberOfPages;

    public void setTitle(String bookTitle) {
        title = bookTitle;
    }

    public void setAuthor(String bookAuthor) {
        author = bookAuthor;
    }

    public void setNumberOfPages(int bookNumberOfPages) {
        numberOfPages = bookNumberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void showBookInfo() {
        System.out.println("My book is called '" + title + "'.");
        System.out.println("My book was written by " + author + ".");
        System.out.println("My book is " + numberOfPages + " pages long.");
    }

}
