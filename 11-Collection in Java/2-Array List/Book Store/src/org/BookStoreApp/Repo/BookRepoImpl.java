package org.BookStoreApp.Repo;
import java.util.*;

import org.BookStoreApp.model.*;

public class BookRepoImpl implements BookRepo{
	ArrayList al=new ArrayList();
	
	@Override
	public boolean isAddBook(Book book) {
		
		return al.add(book);
	}

	@Override
	public List getBooks() {
		return al;
	}

	@Override
	public Book getBookId(int bookId) {
		boolean flag=false;	
		Book b=null;
		for(Object obj:al) {
			b=(Book)obj;
			if(b.getBook_id()==bookId) {
				flag=true;
				break;
			}
		}
		return flag ? b : null;
	}

	@Override
	public Book delBook(int bookId) {
		boolean flag=false;	
		Book b=null;
		for(Object obj:al) {
			b=(Book)obj;
			if(b.getBook_id()==bookId) {
				al.remove(obj);
				
				flag=true;
				break;
			}
		}
		return flag ? b : null;
	}

	@Override
	public boolean UpdateBook(int id, String name, String author, double price) {
		Book b=null;
		for(Object obj:al) {
			b=(Book)obj;
			if(b.getBook_id()==id) {
				b.setBook_id(id);
				b.setBook_name(name);
				b.setBook_author(author);
				b.setBook_price(price);
				
				return true;
				
			}
		}
		return false;
	}

	@Override
	public int getSize() {
		return al.size();
	}

	@Override
	public Book SamePriceBook() {
		Book book=null;
		for(Object obj:al) {
			
			//if(obj.)
		}
		return book;
	}

}
