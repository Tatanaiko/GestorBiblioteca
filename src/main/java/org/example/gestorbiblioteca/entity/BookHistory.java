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
@Table(name="historial_libro")
public class BookHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name= "id_libro", nullable = false)
    private Book book;

    @ManyToOne
    @JoinColumn(name="id_usuario")
    private User user;

    @Column(name="fecha_prestamo")
    private LocalDate loanDate;

    @Column(name="fecha_devolucion")
    private LocalDate returnDate;

    @Column(name="Historial_prestamos")
    private String loanHistory;

    @Column(name="Historial_devoluciones")
    private String returnHistory;

}
