import java.lang.*;

public class Account
{
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public Account()
	{
		//System.out.println("This is empty constructor for Account!");
	}
	
	public Account(int accountNumber, String accountHolderName, double balance)
	{
		System.out.println("This is Parameterized constructor!");
		
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}
	
	public void showDetails()
	{
		System.out.println("Account number : " + accountNumber);
		System.out.println("Account holder name : " + accountHolderName);
		System.out.println("Account balance : " + balance + " $");
	}	
}