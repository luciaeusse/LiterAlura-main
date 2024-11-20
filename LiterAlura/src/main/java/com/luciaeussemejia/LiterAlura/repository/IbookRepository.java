package com.luciaeussemejia.LiterAlura.repository;

import com.luciaeussemejia.LiterAlura.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IbookRepository extends JpaRepository<Book,Long> {
    List<Book> findBookByLanguage(String language);
}
