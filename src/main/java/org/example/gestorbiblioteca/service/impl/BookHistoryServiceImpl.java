package org.example.gestorbiblioteca.service.impl;

import org.example.gestorbiblioteca.entity.Book;
import org.example.gestorbiblioteca.entity.BookHistory;
import org.example.gestorbiblioteca.repository.IBookHistoryRepository;
import org.example.gestorbiblioteca.repository.IBookRepository;
import org.example.gestorbiblioteca.service.IBookHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service

public class BookHistoryServiceImpl implements IBookHistoryService {

    @Autowired
    private IBookHistoryRepository bookHistoryRepository;

    @Autowired
    private IBookRepository bookRepository;

    private List<Book> lendsBooks;


    @Override
    public BookHistory getBookHistory(long id) {
        BookHistory bookHistory = bookHistoryRepository.findById(id).orElse(null);
        return bookHistory;
    }

    @Override
    public List<BookHistory> getAllBooksHistories() {
        return bookHistoryRepository.findAll();
    }

    @Override
    public BookHistory saveBookHistory(BookHistory bookHistory) {
        return bookHistoryRepository.save(bookHistory);
    }

    @Override
    public BookHistory updateBookHistory(BookHistory bookHistory) {
        return bookHistoryRepository.save(bookHistory);
    }

    @Override
    public void deleteBookHistoryById(Long id) {
        bookHistoryRepository.deleteById(id);
    }

    @Override
    public void deleteBookHistory(BookHistory bookHistory) {
        bookHistoryRepository.delete(bookHistory);
    }

    @Override
    public boolean isLend(LocalDate returnDate) {
        if(returnDate == null) {
            return false;
        }
        return true;
    }

    @Override
    public List<Book> getBookByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    @Override
    public List<Book> getBookByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }
}
