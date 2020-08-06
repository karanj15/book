package com.karan.spring.service;

import java.util.List;

import com.karan.spring.model.Book;

public interface BookService {

	 //Save the record
		long save(Book book);
		
		//Get a single record
		Book get(long id);
		
		//Get all the records
		List<Book> list();
		
		//update the record
		void update(long id, Book book);
		
		//delete the record
		void delete(long id);
}
