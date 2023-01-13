package question07;

public class Wallet {
	 public static void processPaymentByUser(User user, double billAmount) {
	        boolean paymentSuccessful = user.makePayment(billAmount);
	        if (paymentSuccessful) {
	            System.out.println("Current wallet balance: $" + user.getWalletBalance());
	            if (user instanceof KYC) {
	                KYC kyc = (KYC) user;
	                System.out.println("Reward points: " + kyc.getRewardPoints());
	            }
	            else 
	                 System.out.println("you are not eligible for reward points");

	            }
	        }
	    
}
