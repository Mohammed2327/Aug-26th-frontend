package com.arrays;
import java.util.ArrayList;
import java.util.Scanner;

class Book{
	String title;
	String author;
	
	Book(String title, String author){
	this.title = title;
	this.author = author;
}
}

class Library{
	private ArrayList<Book> books;
	
	public Library() {
		books = new ArrayList<>();
	}
	
	public void addBook (String title, String author) {
		books.add(new Book(title, author));
		System.out.println("Book added successfully!");
	}
	
	public void searchBook(String title) {
		for(Book book: books) {
			if(book.title.equalsIgnoreCase(title)) {
				System.out.println("Book Found!");
				System.out.println("Title: " +book.title + ", Author: " + book.author);
				return;
			}
		}
			System.out.println("Book not Found!");
	}
	
	public void displayBooks() {
		if(books.isEmpty()) {
			System.out.println("No books available in the Library");
			return;
		}
		
		System.out.println("Books in the Library");
		for(int i=0; i<books.size(); i++) {
			System.out.println((i + 1) + ".Title:"+books.get(i).title+ ", Author:" +books.get(i).author);
		}
	}
	
	public void removeBooks(String title) {
		for(Book book : books) {
			if(book.title.equalsIgnoreCase(title)) {
				books.remove(title);
				System.out.println("Book removed successfully!");
				return;
			}
	}
		
		System.out.println("Book not Found!");
	}
}

public class BookLibrary {
	public static void main(String[] args) {
		Library library = new Library();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\nLibrary Management System");
			System.out.println("1. Add a New Book ");
			System.out.println("2. Search for a Book by Title");
			System.out.println("3. Display All Books ");
			System.out.println("4. Remove a Book by Title ");
			System.out.println("5. Exit ");
			System.out.println("Choose an option:  ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1: 
				System.out.println("Enter the book title");
				String title = sc.nextLine();
				System.out.println("Enter the book author");
				String author = sc.nextLine();
				library.addBook(title, author);
				break;
				
			case 2:
				System.out.println("Enter the book title to search");
				title = sc.nextLine();
				library.searchBook(title);
				break;
			case 3:
				library.displayBooks();
				break;
			case 4:
				System.out.println("Enter the book title to remove");
				title = sc.nextLine();
				library.removeBooks(title);
				break;
			case 5:
				System.out.println("Exiting the system...");
				sc.close();
				return;
				
			default:
				System.out.println("Invalid option, please try again");
			}
		}
	}

}
