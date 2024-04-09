package org.javamaster.lab3.services;

import org.javamaster.lab3.entities.Book;
import org.javamaster.lab3.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

  @Autowired
  private BookRepository bookRepository;

  public List<Book> getAllBooks() {
    return bookRepository.findAll();
  }

  public Book getBook(int id) {
    return bookRepository.findById(id).orElse(null);
  }

  public Book createBook(Book book) {
    return bookRepository.save(book);
  }

  public Book updateBook(int id, Book book) {
    Book existingBook = bookRepository.findById(id).orElse(null);
    if (existingBook == null) {
      return null;
    }

    return bookRepository.save(book);
  }

  public void deleteBook(int id) {
    bookRepository.deleteById(id);
  }
}
