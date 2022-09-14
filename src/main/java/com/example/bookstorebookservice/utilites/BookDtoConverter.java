package com.example.bookstorebookservice.utilites;

import com.example.bookstorebookservice.domain.Book;
import com.example.bookstorebookservice.dto.AddBookRequest;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class BookDtoConverter {

    public Book convertFromDto(AddBookRequest request) {
        String index = getIndex(request);
        return new Book(index, request.getAuthor(), request.getName(), request.getPages(), request.getPrice(), LocalDateTime.now());
    }

    private String getIndex(AddBookRequest request) {
        List<String> separated = new ArrayList<>(Arrays.stream(request.getAuthor().split(" ")).toList());
        separated.addAll(Arrays.stream(request.getName().split(" ")).toList());
        separated.add(String.valueOf(request.getPages()));
        StringBuilder sb = new StringBuilder();
        separated.forEach(o -> sb.insert(sb.length(), o + "_"));
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

}
