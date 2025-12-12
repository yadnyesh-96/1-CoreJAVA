package org.BookStoreApp.Repo;
import java.util.*;
import org.BookStoreApp.model.*;
public interface BookRepo {
	public boolean isAddBook(Book book);
	public List getBooks();
	public Book getBookId(int bookId);
	public Book	delBook(int bookId);
	public boolean UpdateBook(int id,String name,String author,double price);
	public int getSize();
	public Book SamePriceBook();
}
