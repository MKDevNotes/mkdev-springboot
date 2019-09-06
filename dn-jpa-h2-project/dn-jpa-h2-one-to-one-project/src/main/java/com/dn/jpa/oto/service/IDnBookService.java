package com.dn.jpa.oto.service;

public interface IDnBookService{

    void init();
    void deleteAll();
    void delete(Integer id);
    List<Book> findAll();
}