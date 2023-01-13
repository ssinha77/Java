package BankAccount;

public class BankMain {

	public static void main(String[] args) {
	
			
		Accounts c1 = new Accounts( 23449798, "Rocky");
		c1.deposit(5000);
		c1.withdraw(1000);
		
		System.out.println("After Deposit");
		System.out.println( "The account No is :" +c1.accountNo);
		System.out.println("The name is :" +c1.name);
		System.out.println("The balance is :" +c1.balance);
		
		
		Accounts c2 = new Accounts( 2345698, "Ali");
		System.out.println( "The account No is :" +c2.accountNo);
		System.out.println( "The name is :" +c2.name);
		System.out.println("The balance is :" +c2.balance);
		
	c2.deposit(2000);
	
	
	System.out.println("The balance of c1 :"+ c1.balance);
	System.out.println("The balance of c2 :"+ c2.balance);
	}

}
