package org.example.gestorbiblioteca.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="libros")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = false)
    private long id;

    @Column(name="titulo", nullable = false, length = 200)
    private String title;

    @Column(name="autor", nullable = false, length = 100)
    private String author;

    @Column(name="disponible", nullable = false)
    private boolean avalibleBook;
}
