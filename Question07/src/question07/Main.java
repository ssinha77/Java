package question07;

public class Main {
	  public static void main(String[] args) {
          User user1 = new User(1,"Rashi","Rashi9@gmail.com",107);
          Wallet.processPaymentByUser(user1, 500);



          KYC user2 = new KYC(2,"Rahul","Rahul@gmail.com",1008,11);
          Wallet.processPaymentByUser(user2, 750);
      }
}

