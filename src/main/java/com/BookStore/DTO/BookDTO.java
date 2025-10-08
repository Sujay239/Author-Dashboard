package com.BookStore.DTO;

import com.BookStore.Entity.Genre;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class BookDTO {
    private Long id;
    private String title;
    private String isbn;
    private String description;
    private BigDecimal price;
    private LocalDate publicationDate;
    private Genre genre;
    private Long authorId;
    private String authorName;

    // Constructors, Getters and Setters
    public BookDTO() {}

    // Constructor for creating books
    public BookDTO(String title, String isbn, String description, BigDecimal price,
                    Genre genre, Long authorId) {
        this.title = title;
        this.isbn = isbn;
        this.description = description;
        this.price = price;
        this.publicationDate = LocalDate.now();
        this.genre = genre;
        this.authorId = authorId;
    }
}
