import java.lang.*;
public class Start 
{    
	public static void main(String[] args)
	{
		Customer c1 = new Customer("+880123456", 4);


	Account a = new Account();
	a.setAccountNumber(365);
	a.setAccountHolderName( "DiponBiswas");
	a.setBalance(855.0);

	Account a1 = new Account();
	a1.setAccountNumber(365);
	a1.setAccountHolderName( "DiponBiswas");
	a1.setBalance(855.0);

	Account a2 = new Account();
	a2.setAccountNumber(365);
	a2.setAccountHolderName( "DiponBiswas");
	a2.setBalance(855.0);

	Account a3 = new Account();
	a3.setAccountNumber(365);
	a3.setAccountHolderName( "DiponBiswas");
	a3.setBalance(855.0);

	Customer c= new Customer();
	c.setPhnNumber("01700963099");
	c.setAccount(a);
	 System.out.println(",");
	 c.showDetails();
	 System.out.println(",");

	

	System.out.println("The AccountNumber is: " +a.getAccountNumber());
	System.out.println("The AccountHolderName is :"+a.getAccountHolderName());
	System.out.println("The Balance is :"+a.getBalance()+"Taka");

	Account a1 = new Account(5423651 ,"Dipon Biswas" ,855.5);
	Customer c1 = new Customer("01700963099", a1);
	
	System.out.println("Customer Phonenumber :"+c1.getPhnNumber());
	System.out.println("Customer account Number is ="+c1.getAccount().getAccountNumber());
	System.out.println("Customer account Holder Number is ="+c1.getAccount().getAccountHolderName());
	System.out.println("Customer account Balance is ="+c1.getAccount().getBalance());

	c1.insertAccount(a);
	c1.showAllAccounts();



}

}