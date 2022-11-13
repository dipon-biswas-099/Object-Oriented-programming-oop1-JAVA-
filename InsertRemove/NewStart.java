import java.lang.*;

public class NewStart
{
	public static void main(String[] args)
	{
		Customer c1 = new Customer("0123456789", 5);


		Account a1 = new Account();   //object definiition 
		a1.setAccountNumber(10);
		a1.setAccountHolderName("NUR");
		a1.setBalance(1000);
		a1.showDetails();
		
		Account a2 = new Account();   //object definiition 
		a2.setAccountNumber(20);
		a2.setAccountHolderName("Habib");
		a2.setBalance(2000);
		a2.showDetails();
		
		Account a3 = new Account();   //object definiition 
		a3.setAccountNumber(30);
		a3.setAccountHolderName("NURSHED");
		a3.setBalance(3000);
		a3.showDetails();
		
		Account a4 = new Account();   //object definiition 
		a4.setAccountNumber(40);
		a4.setAccountHolderName("YOO YOO NUuuR");
		a4.setBalance(4000);
		a4.showDetails();
		
		Account a5 = new Account();   //object definiition 
		a5.setAccountNumber(50);
		a5.setAccountHolderName("NnnUrrrR");
		a5.setBalance(5000);
		a5.showDetails();
		
		c1.insertAccount(a1);
		c1.insertAccount(a2);
		c1.insertAccount(a4);
		c1.showAllAccount();
		
		c1.removeAccount(a4);
		c1.showAllAccount();
		
		
		
		
		
		
	}
	
	
}