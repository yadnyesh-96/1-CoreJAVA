package org.BookStoreApp.Service;
import java.util.*;
import org.BookStoreApp.model.*;
public interface BookService {
	public boolean isAddBook(Book book);
	public List getBooks();
	public Book getBookById(int bookId);
	public Book delBook(int bookId);
	public boolean UpdateBook(int id,String name,String author,double price);
	public void getSize();
	
}
