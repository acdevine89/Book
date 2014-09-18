package com.example.Book;


public class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book();

        myBook.setTitle("The Lord of the Rings: The Fellowship of the Ring");
        myBook.setAuthor("J.R.R. Tolkien");
        myBook.setNumberOfPages(426);

        System.out.println("My book is called '" + myBook.getTitle() + "'.");
        System.out.println("My book was written by " + myBook.getAuthor() + ".");
        System.out.println("My book is " + myBook.getNumberOfPages() + " pages long.");

    }
}
