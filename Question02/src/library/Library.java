package library;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Library {
	  private static Book[] books ;

	    public static void main(String[] args) {
	        Author author1 = new Author("author1", 34, 'M');
	        Author author2 = new Author("author2", 23, 'F');


	        Book book1 = new Book("Book1", author1, 345, 23);
	        Book book2 = new Book("Book2", author1, 500, 50);
	        Book book3 = new Book("Book3", author2, 543, 34);
	        Book book4 = new Book("Book4", author1, 653, 23);
	        Book book5 = new Book("Book5", author2, 234, 54);

	        books = new Book[]{book1, book2, book3, book4, book5};

	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Please enter book index[0-4]");
	        int num = scanner.nextInt();
	        Book bookDetails = getBookDetails(num);
	        System.out.println("********** Book Details ***********");

	        System.out.println(bookDetails);

	        System.out.println("********** Author Details *********");
	        System.out.println(bookDetails.getAuthor());
	    }


	    private static Book getBookDetails(int number){
	        return books[number];
	    }
	}

	