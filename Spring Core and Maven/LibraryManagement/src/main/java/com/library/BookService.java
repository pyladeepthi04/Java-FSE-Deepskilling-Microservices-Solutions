package com.library;

public class BookService {

    private BookRepository bookRepository;

    public BookService() {
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayService() {
        System.out.println("Book Service is working...");
        bookRepository.display();
    }
}