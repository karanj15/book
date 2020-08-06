package com.karan.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karan.spring.dao.BookDAO;
import com.karan.spring.model.Book;

@Service
public class BookServiceImpl  implements BookService{

	@Autowired
	private BookDAO bookDAO;
	@Override
	public long save(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Book get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public List<Book> list() {
		bookDAO.list();
		return null;
	}

	@Override
	public void update(long id, Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
