package com.example.bookstorebookservice.controller;

import com.example.bookstorebookservice.core.AddBookService;
import com.example.bookstorebookservice.dto.AddBookRequest;
import com.example.bookstorebookservice.dto.AddBookResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/book/admin")
@RequiredArgsConstructor
public class AdminBookController {

    private final AddBookService addBookService;

    @PostMapping(value = "/add", produces = "application/json", consumes = "application/json")
    public AddBookResponse addBook(@RequestBody @Valid AddBookRequest request) {
        return addBookService.addBook(request);
    }

}
