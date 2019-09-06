package com.dn.jpa.oto.repository;

import com.dn.jpa.oto.model.DnBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDnBookRepository extends JpaRepository<DnBook,Long>{
}