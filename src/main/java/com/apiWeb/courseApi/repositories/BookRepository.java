package com.apiWeb.courseApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apiWeb.courseApi.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {}
