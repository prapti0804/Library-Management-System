package com.project.lms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.lms.entity.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer> {
	
	//for search a book name starting with
	List<Books> findByBookNameStartingWith(String bookName);
}
