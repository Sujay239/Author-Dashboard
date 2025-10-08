package com.BookStore.Entity;

import com.BookStore.Entity.Author;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@Entity
@Table(name = "books")
public class Book {
    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String isbn;

    private String description;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(name = "publication_date")
    private LocalDate publicationDate;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;

    // Constructors
    public Book() {}

    public Book(String title, String isbn, String description, BigDecimal price,
                LocalDate publicationDate, Genre genre, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.description = description;
        this.price = price;
        this.publicationDate = publicationDate;
        this.genre = genre;
        this.author = author;
    }

}

