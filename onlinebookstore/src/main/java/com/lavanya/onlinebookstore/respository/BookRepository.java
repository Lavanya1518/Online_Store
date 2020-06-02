package com.lavanya.onlinebookstore.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lavanya.onlinebookstore.model.Book;

public interface BookRepository extends JpaRepository<Book,Long>{

}
