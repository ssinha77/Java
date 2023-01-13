package BankAccount;

public class Accounts {
int accountNo;
String name;
double balance;

public Accounts() {
	accountNo=0;
	balance=0;
	name="unknown";
}

public Accounts(int no, String name) {
	this.accountNo = no;
	this.name = name;
	this.balance= 0.0;
}
		
		//Set balance to 0.00
		//public Accounts() {
		//	balance=0.0;
		//}
		
		//Deposit
		public void deposit (double amount) {
			balance = balance + amount;
		}
       //withdraw
		public void withdraw(double amount) {
			if(amount<=balance) {
				balance = balance - amount;	
			}
			else {
				System.err.println("Insufficient Funds");
			}
		}
		
		//Get Balance 
		public double getBalance() {
			return balance;
		
		}
		}


