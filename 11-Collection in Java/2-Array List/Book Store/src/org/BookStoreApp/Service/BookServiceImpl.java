package org.BookStoreApp.Service;

import org.BookStoreApp.model.Book;

import java.util.List;

import org.BookStoreApp.Repo.*;
public class BookServiceImpl implements BookService{
	
	BookRepo bookRepo=new BookRepoImpl();
	@Override
	public boolean isAddBook(Book book) {
		
		return bookRepo.isAddBook(book);
	}
	@Override
	public List getBooks() {
		return bookRepo.getBooks();
	}
	@Override
	public Book getBookById(int bookId) {
		
		return bookRepo.getBookId(bookId);
	}
	@Override
	public Book delBook(int bookId) {
		
		return bookRepo.delBook(bookId);
	}
	@Override
	public boolean UpdateBook(int id, String name, String author, double price) {
		
		return bookRepo.UpdateBook(id, name, author, price);
	}
	@Override
	public void getSize() {
		System.out.println("Total Number of Books is :"+bookRepo.getSize());
	}

}
