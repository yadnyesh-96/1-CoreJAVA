package org.BookStoreApp.clientapp;

import java.util.*;
import org.BookStoreApp.Service.*;
import org.BookStoreApp.model.*;

public class BookApplication {
	static BookService bookService = new BookServiceImpl();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("-----------------------------");
			System.out.println("1.Add new Book");
			System.out.println("2.View All Book");
			System.out.println("3.Serach Book by Id");
			System.out.println("4.Delete Book by Id");
			System.out.println("5.Update book details by Id");
			System.out.println("6.Count the number of Books");
			System.out.println("7.Count books by same price");
			System.out.println("8.Show the book Author-wise");
			System.out.println("9.Exit");
			System.out.println("Enetr your choice:");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter book details : Book Id, Book Name, Author, Price:");
				int id = sc.nextInt();
				String name = sc.next();
				String author = sc.next();
				// sc.next();
				double price = sc.nextDouble();

				Book book = new Book(id, name, author, price);
				boolean b = bookService.isAddBook(book);
				if (b) {
					System.out.println("Book Added");
				} else {
					System.out.println("Book not Addded");
				}
				break;
			case 2:
				List list = bookService.getBooks();
				for (Object obj : list) {
					Book book1 = (Book) obj;
					System.out.print(book1.getBook_id() + "\t" + book1.getBook_name() + "\t" + book1.getBook_author()
							+ "\t" + book1.getBook_price() + "\n");
				}
				break;
			case 3:
				System.out.println("Enter Book Id for Search :");
				int id1 = sc.nextInt();
				Book book1 = bookService.getBookById(id1);
				if (book1 != null) {
					System.out.println("Book is Found\n");
					System.out.print(book1.getBook_id() + "\t" + book1.getBook_name() + "\t" + book1.getBook_author()
							+ "\t" + book1.getBook_price() + "\n");
				} else {
					System.out.println("Book Not Found");
				}
				break;
			case 4:
				System.out.println("Enter Book Id for Delete");
				id1 = sc.nextInt();
				Book book11 = bookService.delBook(id1);
				if (book11 != null) {
					System.out.println("Book is Deleted \n");
					System.out.print(book11.getBook_id() + "\t" + book11.getBook_name() + "\t" + book11.getBook_author()
							+ "\t" + book11.getBook_price() + "\n");
				} else {
					System.out.println("Book Not Found");
				}
				break;
			case 5:
				System.out.println("You can't change book Id");
				System.out.println("Enter Book ID Want to Update ");

				id1 = sc.nextInt();
				book = bookService.getBookById(id1);
				if (book == null) {
					System.out.println("Id not Exists ");
					break;
				}

				System.out.println("Enter book details : Book Id, Book Name, Author, Price:");
				id = sc.nextInt();
				name = sc.next();
				author = sc.next();
				// sc.next();
				price = sc.nextDouble();

				b = bookService.UpdateBook(id, name, author, price);
				if (b) {
					System.out.println("Book detail updated");
				} else {
					System.out.println("Book Not Found");
				}

				break;
			case 6:
					bookService.getSize();
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				System.out.println("Exiting....");
				break;
			default:
				System.out.println("Wrong choice");
			}
		} while (true);

	}

}
