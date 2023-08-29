package com.ddsr.LibraryExample.repository;

import com.ddsr.LibraryExample.entity.UsersLibrary;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UsersLibrary, Integer> {
}
