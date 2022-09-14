package com.example.bookstorebookservice.dto;

import com.example.bookstorebookservice.domain.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddBookResponse {

    private Book book;

}
