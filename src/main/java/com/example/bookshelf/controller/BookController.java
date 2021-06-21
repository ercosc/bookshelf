package com.example.bookshelf.controller;

import com.example.bookshelf.model.Book;
import com.example.bookshelf.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

    @Autowired
    private BookRepository br;

    
    @RequestMapping("/livros")
    public ModelAndView bookList() {
        ModelAndView mv = new ModelAndView("index");
        Iterable<Book> books = br.findAll();
        mv.addObject("books", books);
        return mv;
    }

    @RequestMapping(value="/cadastrarLivro", method = RequestMethod.GET)
    public String formBook() {

        return "book/formBook";
    }

    @RequestMapping(value="/cadastrarLivro", method = RequestMethod.POST)
    public String saveBook(Book b) {
        br.save(b);
        return "redirect:/livros";
    }

    @RequestMapping(value="/{bookId}", method = RequestMethod.GET)
    public ModelAndView bookDetail(@PathVariable("bookId") long bookId) {
        ModelAndView mv = new ModelAndView("book/bookDetail");
        Book b = br.findBookByBookId(bookId);
        mv.addObject("book", b);
        return mv;
    }

    @RequestMapping("/deletar")
    public String bookDelete(long bookId) {
        Book e = br.findBookByBookId(bookId);   
        br.delete(e);
        return "redirect:/livros";
    }
}
