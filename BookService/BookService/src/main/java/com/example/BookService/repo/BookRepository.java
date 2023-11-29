package com.example.BookService.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookService.entity.Books;

public interface BookRepository extends JpaRepository<Books, Integer> {

}
