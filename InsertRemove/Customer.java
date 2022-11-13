import java.lang.*;

public class Customer
{
	private String phoneNumber;
	private Account accounts[];
	
	public Customer()
	{
		//System.out.println("Empty Customer");
	}
	public Customer(String phoneNumber,int sizeOfAccounts)
	{
		//System.out.println("Para Customer");
		this.phoneNumber=phoneNumber;
		accounts = new Account[sizeOfAccounts];
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber=phoneNumber;	
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
    public void showAllAccount()
    {
    	for(int i=0; i<accounts.length; i++)
    	{
    		if(accounts[i] != null)
    		{
    			System.out.println("***********************");
    			System.out.println("Account number : ["+i+"]: "+accounts[i].getAccountNumber());
    			System.out.println("Account holder name: ["+i+"]: "+accounts[i].getAccountHolderName());
    			System.out.println("Account balancet: ["+i+"]: "+accounts[i].getBalance());
    			System.out.println("***********************");
    		}
    	}
    }
	public void insertAccount(Account a)
	{
		int flag = 0;      //flag initiate
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == null)    //check if null or empty
			{
				accounts[i] = a;     //assigned and inserted 
				flag = 1;    //flag change
				break;
			}
		}
		if(flag == 1){System.out.println("----Inserted----");}     //flag check
		else {System.out.println("----CanNot Insert----");}
	}
    public void removeAccount(Account a)
	{
		int flag = 0;      //flag initiate
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == a)    //check if object is there
			{
				accounts[i] = null;     //deleted or removed  
				flag = 1;    //flag change
				break;
			}
		}
		if(flag == 1){System.out.println("----removed----");}     //flag check
		else {System.out.println("----cant remove----");}
	}
}