package question07;


public class KYC extends User{
	public KYC(int userId, String userName, String email, double walletBalance, double rewardPoints) {
	       super(userId, userName, email, walletBalance);
	       this.rewardPoints = rewardPoints;
	   }
	   private double rewardPoints;

	       @Override
	       public boolean makePayment(double billAmount) {
	           boolean paymentSuccessful = super.makePayment(billAmount);
	           if (paymentSuccessful) {
	               rewardPoints += billAmount * 0.1;
	               System.out.println("Added " + (billAmount * 0.1) + " reward points.");
	           }
	           return paymentSuccessful;
	       
	       }

		public String getRewardPoints() {
			// TODO Auto-generated method stub
			return null;
		}
}
