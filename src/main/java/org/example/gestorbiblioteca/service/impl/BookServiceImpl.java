package org.example.gestorbiblioteca.service.impl;

import org.example.gestorbiblioteca.entity.Book;
import org.example.gestorbiblioteca.entity.User;
import org.example.gestorbiblioteca.repository.IBookRepository;
import org.example.gestorbiblioteca.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private IBookRepository bookRepository;

    @Override
    public Book getBook(Long id) {
        Book book = bookRepository.findById(id).orElse(null);
        return book; //buscar libro por id
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }// listas tods libros

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    } // agregar libro

    @Override
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }


}
