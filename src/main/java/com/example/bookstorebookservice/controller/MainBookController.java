package com.example.bookstorebookservice.controller;

import com.example.bookstorebookservice.core.FindAllBookService;
import com.example.bookstorebookservice.dto.FindAllBooksResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class MainBookController {

    private final FindAllBookService findAllBookService;

    @GetMapping(value = "/allbooks")
    public FindAllBooksResponse getAllBooks() {
        return findAllBookService.getAllBooks();
    }

}
