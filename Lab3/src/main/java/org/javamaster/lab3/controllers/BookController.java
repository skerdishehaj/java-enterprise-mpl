package org.javamaster.lab3.controllers;

import org.javamaster.lab3.entities.Book;
import org.javamaster.lab3.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("")
    public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getAllBooks(@PathVariable int id) {
        Book book = bookService.getBook(id);
        if(book == null) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(bookService.getBook(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBookById(@PathVariable int id, @RequestBody Book book) {
        Book bookUpdated = bookService.updateBook(id, book);
        if(book == null) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(bookUpdated, HttpStatus.OK);
    }

}
