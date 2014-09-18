package com.example.Book;


public class BookDemo {

    public static void readingIsAwesome() {
        System.out.println("Reading is awesome!");
    }

    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.setTitle("The Lord of the Rings: The Fellowship of the Ring");
        myBook.setAuthor("J.R.R. Tolkien");
        myBook.setNumberOfPages(426);
        myBook.showBookInfo();
        Book.booksInLibrary();
        readingIsAwesome();
    }

}

