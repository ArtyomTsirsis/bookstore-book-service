package com.example.bookstorebookservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity(name="Book")
@Table(name="Books")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @JsonIgnore
    private String index;
    @Column
    private String author;
    @Column
    private String name;
    @Column
    private int pages;
    @Column
    private double price;
    @Column
    private LocalDateTime creationTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Book book = (Book) o;
        return index != null && Objects.equals(index, book.index);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
