package com.ddsr.LibraryExample.repository;

import com.ddsr.LibraryExample.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Books, Integer> {
}
