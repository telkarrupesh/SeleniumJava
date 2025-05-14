package classObjects;

public class Constuctersdemo {
	
	
	String book_title;
	String book_author;
	int book_price;
	
	public Constuctersdemo(String title, String author, int price)
	
	{
		book_title = title;
		book_author = author;
		book_price = price;
		
		System.out.println("The Title of the book is:"+book_title);
		System.out.println("The Author of the book is:"+author);
		System.out.println("The Price of the book is:"+price);
		
	}
	
	

}
