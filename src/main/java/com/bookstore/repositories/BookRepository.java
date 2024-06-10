package com.bookstore.repositories;

import com.bookstore.models.AuthorModel;
import com.bookstore.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;
import java.util.UUID;

public interface BookRepository extends JpaRepository<BookModel, UUID> {
    BookModel findBookModelByTitle(String title);
}
