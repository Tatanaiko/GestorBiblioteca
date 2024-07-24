package org.example.gestorbiblioteca.service;

import org.example.gestorbiblioteca.entity.Book;
import org.example.gestorbiblioteca.entity.User;

import java.util.List;

public interface IBookService {
    Book getBook(Long id);
    List<Book> getAllBooks();
    Book saveBook(Book book);
    Book updateBook(Book book);
    void deleteBookById(Long id);
    void deleteBook(Book book);
//-------------------------------------------------------//

}


