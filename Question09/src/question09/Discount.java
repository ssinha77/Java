package question09;
import java.util.HashMap;
public class Discount {
	 public static double calculateTicketAmount(BookMyMovie bookMyMovie, HashMap<Integer, Integer> movieData) {
	        if(!movieData.containsKey(bookMyMovie.getMovieId())){
	            throw new InvalidMovieException("Sorry Invalid Movie");
	        }
	        int baseFare = movieData.get(bookMyMovie.getMovieId());
//	        int discount = 0;
	        double discount = calculateDiscount(bookMyMovie.getMovieId(), bookMyMovie.getNoOfTickets());

	        double totalAmount = baseFare * bookMyMovie.getNoOfTickets() - (baseFare * bookMyMovie.getNoOfTickets() * (discount / 100));
	        return totalAmount;
	    }

	    private static double calculateDiscount(int ticketId, int numberOfTickets) {

	        if ((ticketId == 101 || ticketId == 103) && (numberOfTickets >= 5 && numberOfTickets <= 10)) {
	            return 15;
	        }
	        if ((ticketId == 101 || ticketId == 103) && (numberOfTickets >= 10 && numberOfTickets <= 15)) {
	            return 20;
	        }

	        if ((ticketId == 102) && (numberOfTickets >= 5 && numberOfTickets <= 10)) {
	            return 10;
	        }
	        if ((ticketId == 102) && (numberOfTickets >= 10 && numberOfTickets <= 15)) {
	            return 15;
	        }
	        return 0;

	    }
	

}
