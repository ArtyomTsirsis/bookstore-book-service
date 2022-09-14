package com.example.bookstorebookservice.core;

import com.example.bookstorebookservice.domain.Book;
import com.example.bookstorebookservice.dto.AddBookRequest;
import com.example.bookstorebookservice.dto.AddBookResponse;
import com.example.bookstorebookservice.repository.BookRepository;
import com.example.bookstorebookservice.utilites.BookDtoConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.management.openmbean.KeyAlreadyExistsException;
import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class AddBookService {

    private final BookRepository repository;
    private final BookDtoConverter dtoConverter;

    @Transactional
    public AddBookResponse addBook(AddBookRequest request) throws KeyAlreadyExistsException {
        Book bookToAdd = repository.save(dtoConverter.convertFromDto(request));
        if (!repository.existsById(bookToAdd.getIndex())) {
            throw new KeyAlreadyExistsException();
        }
        return new AddBookResponse(bookToAdd);
    }

}
