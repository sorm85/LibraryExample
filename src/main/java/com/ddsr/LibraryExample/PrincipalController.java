package com.ddsr.LibraryExample;


import com.ddsr.LibraryExample.entity.Books;
import com.ddsr.LibraryExample.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//import java.awt.print.Book;

@RestController
public class PrincipalController {

    private final BookRepository bookRepository;

    @Autowired
    public PrincipalController (BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @PostMapping (value = "/saveBook")
    public String addBook (@RequestBody Books books){
        bookRepository.save(books);
        return "Libro salvados";
    }
    @PostMapping (value = "/printBook")
    public List<Books> addBook (){
        return bookRepository.findAll();
//        return "Libro salvados";
    }
}
