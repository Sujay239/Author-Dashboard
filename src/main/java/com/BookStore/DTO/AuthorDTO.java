package com.BookStore.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthorDTO {
    // Getters and Setters
    private Long id;
    private String name;
    private String email;
    private String password;
    private String biography;

    // Constructors
    public AuthorDTO() {}

    public AuthorDTO(String name, String email, String biography, String password) {
        this.name = name;
        this.email = email;
        this.biography = biography;
        this.password = password;
    }

}