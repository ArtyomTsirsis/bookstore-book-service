package com.example.bookstorebookservice;

import com.example.bookstorebookservice.domain.Book;
import com.example.bookstorebookservice.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootApplication
public class BookstoreBookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreBookServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner books(BookRepository bookRepository) {
		return args -> {
			IntStream.rangeClosed(1, 100)
							.mapToObj(i -> new Book("index_" + i, "Author_" + i, "Name_" + i, 100 + i, 10 + i, LocalDateTime.now()))
									.collect(Collectors.collectingAndThen(Collectors.toList(), bookRepository::saveAll));
		};
	}

}
