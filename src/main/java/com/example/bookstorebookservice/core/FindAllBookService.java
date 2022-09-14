package com.example.bookstorebookservice.core;

import com.example.bookstorebookservice.dto.FindAllBooksResponse;
import com.example.bookstorebookservice.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class FindAllBookService {

    private final BookRepository repository;

    @Transactional(readOnly = true)
    public FindAllBooksResponse getAllBooks() {
        return new FindAllBooksResponse(repository.findAll());
    }

}
