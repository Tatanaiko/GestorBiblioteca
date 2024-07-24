package org.example.gestorbiblioteca.controller;


import org.example.gestorbiblioteca.entity.Book;
import org.example.gestorbiblioteca.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping("/getAll")
    public String getAllBooks(Model model) {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute ("libros", books);
        return  "book";
    }

//    public String getBooksById(Model model, Long id) {
//        Book book = bookService.getBook(id);
//        model.addAttribute("libros", book);
//        return "book/book";
//    }



}
