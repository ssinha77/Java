package question09;
import java.util.HashMap;
public class Main {
	  public static void main(String[] args) {

	        HashMap<Integer,Integer> movieData = new HashMap<>();
	        movieData.put(101,120);
	        movieData.put(102,170);
	        movieData.put(103,150);

	        BookMyMovie bookMyMovie = new BookMyMovie(102,8);
	        double totalAmount = Discount.calculateTicketAmount(bookMyMovie,movieData);
	        System.out.println("Total amount for booking : " + totalAmount);
	    }
	}

