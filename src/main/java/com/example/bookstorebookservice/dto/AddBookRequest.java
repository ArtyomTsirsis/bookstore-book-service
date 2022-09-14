package com.example.bookstorebookservice.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class AddBookRequest {

    @NotBlank
    private String author;
    @NotBlank
    private String name;
    @Min(1)
    private int pages;
    @Min(0)
    private double price;

}
