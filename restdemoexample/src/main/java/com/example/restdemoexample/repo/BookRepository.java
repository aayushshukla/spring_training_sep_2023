package com.example.restdemoexample.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restdemoexample.entity.Books;

public interface BookRepository extends JpaRepository<Books, Integer> {

}
