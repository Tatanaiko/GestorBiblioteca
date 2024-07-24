package org.example.gestorbiblioteca.service;

import org.example.gestorbiblioteca.entity.Book;
import org.example.gestorbiblioteca.entity.BookHistory;

import java.time.LocalDate;
import java.util.List;

public interface IBookHistoryService {

    BookHistory getBookHistory(long id);
    List<BookHistory> getAllBooksHistories();
    BookHistory saveBookHistory(BookHistory bookHistory);
    BookHistory updateBookHistory(BookHistory bookHistory);
    void deleteBookHistoryById(Long id);
    void deleteBookHistory(BookHistory bookHistory);


    //--------------------------------------------------------//

    boolean isLend(LocalDate returnDate);

    List<Book> getBookByTitle(String title);

    List <Book> getBookByAuthor(String author);

}
