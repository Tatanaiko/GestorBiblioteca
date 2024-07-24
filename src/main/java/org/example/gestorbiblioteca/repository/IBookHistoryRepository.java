package org.example.gestorbiblioteca.repository;

import org.example.gestorbiblioteca.entity.BookHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookHistoryRepository extends JpaRepository<BookHistory, Long> {
}
