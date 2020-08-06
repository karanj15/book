package com.karan.spring.dao;

import java.util.List;

import com.karan.spring.model.Book;

public interface BookDAO {
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
