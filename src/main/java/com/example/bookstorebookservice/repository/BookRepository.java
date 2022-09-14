package com.example.bookstorebookservice.repository;

import com.example.bookstorebookservice.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, String> { }
