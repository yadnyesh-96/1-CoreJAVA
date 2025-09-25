/*
1. Library Book Management
Task:
 Create a Book class with fields: title, author, and price.
 In the main method:
Create two individual Book objects.
Compare the prices of the two books and print the title of the more expensive book.
Explanation:
 This task teaches object instantiation and accessing instance variables directly to perform comparisons.
*/

class Book{
		private int id;
		private String name;
		private String author;
		private int price;
		
		public void setId(int id){
			this.id=id;
		}
		
		public int getId(){
			return id;
		}
		
		public void setName(String name){
			this.name=name;
		}
		
		public String getName(){
			return name;
		}
		
		public void setAuthor(String author){
			this.author=author;
		}
		
		public String getAuthor(){
			return author;
		}
		
		public void setPrice(int price){
			this.price=price;
		}
		
		public int getPrice(){
			return price;
		}
}

class Library{
		private Book books[];
		
		void inputBooksData(Book ...book){
			books=book;
		}
		
		void ShowDetails(){
			
			
			System.out.printf("Id        Name           Author             Price (Rs.)");
			System.out.println("\n------------------------------------------------------"); 
			
			Book maxBook = books[0];  // start with the first book

			for (int i = 1; i < books.length; i++) {
					if (books[i].getPrice() > maxBook.getPrice()) {
						maxBook = books[i];   // update if higher price found
					}
			}
			
			// Print only once: the highest-priced book
				System.out.printf("\n%d   %s   %s   %d /-Rs.",
					maxBook.getId(),
					maxBook.getName(),
					maxBook.getAuthor(),
					maxBook.getPrice());
		}
}


public class LibraryManagement{
	
	public static void main(String x[]){
		
		Library L=new Library();
		
			Book b1=new Book();
			b1.setId(01);
			b1.setName("C Language");
			b1.setAuthor("Dennis Ritchie");
			b1.setPrice(100);
			
			Book b2=new Book();
			b2.setId(02);
			b2.setName("The Secret of Secrets");
			b2.setAuthor("Dan Brown");
			b2.setPrice(1199);
			
			Book b3=new Book();
			b3.setId(03);
			b3.setName("Katabasis");
			b3.setAuthor("R. F. Kuang");
			b3.setPrice(389);
			
			Book b4=new Book();
			b4.setId(04);
			b4.setName("Pumpkin Spice & Everything Nice");
			b4.setAuthor("Katie Cicatelli-Kuc");
			b4.setPrice(981);
			
			Book b5=new Book();
			b5.setId(05);
			b5.setName("The Let Them Theory");
			b5.setAuthor("Mel Robbins");
			b5.setPrice(379);
			
		L.inputBooksData(b1,b2,b3,b4,b5);
		L.ShowDetails();
		
		
		
	}
}