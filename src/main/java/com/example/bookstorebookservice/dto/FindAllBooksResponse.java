package com.example.bookstorebookservice.dto;

import com.example.bookstorebookservice.domain.Book;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class FindAllBooksResponse {

    private List<Book> books;

}
