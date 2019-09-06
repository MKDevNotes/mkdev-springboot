package com.dn.jpa.oto.service;

import com.dn.jpa.oto.repository.IDnBookRepository;

public class DnBookServiceImple implements IDnBookService{

    private final IDnBookRepository bookRepository;

    public BookServiceImpl(IDnBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public void init() {
//        deleteAll();
   //  bookRepository.save(new DnBook)
  //      bookRepository.save(new Book("Spring in Action", new BookDetail(123)));
  //      bookRepository.save(new Book("Spring Boot in Action", new BookDetail(234)));
  //      bookRepository.save(new Book("Spring Microservices in Action", new BookDetail(345)));
  //      bookRepository.save(new Book("Spring Data in Action"));
    }


}