import java.lang.*;
public class Customer
{
	private String phnNumber;
	Account account[];

	public Customer()
	{
		System.out.println("Empty Customer");
	}

	public Customer( String phnNumber, int SizeOfArray)
	{
		System.out.println("para Customer");
		this.phnNumber=phnNumber;
		//this.account=account;
		account=new Account[SizeOfArray];
	}
	public void setPhnNumber(String phnNumber)
	{
		this.phnNumber=phnNumber;
	}

	/*public void setAccount(Account account)
	{
		this.account=account;
	}*/



	public String getPhnNumber()
	{
		return phnNumber;
	}
	public void showDetails(){
		for(int i=0;i<account.length;i++){
			if(account[i] !=null){
				System.out.println("********************");
				System.out.println("Account Number:["+i+"]: "+account[i].getAccountNumber());
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


	public void ShowAllAccount()
	{
		for(int i=0; i<accounts.length; i++)
		{   
			if(accounts[i] != null)
			{
			System.out.println("Account Number : ["+i+"]: "+accounts[i].getAccountNumber());
			System.out.println("Account holder name : ["+i+"]: "+accounts[i].getAccountHolderName());
			System.out.println("Account balance : ["+i+"]: "+accounts[i].getBalance());
			}
		}
	}


	/*public Account getAccount()
	{
		return account;
	}
	public void showDetails()
	{
		System.out.print("Customer phn Number:"+phnNumber);
		account.showDetails();
	}*/
}   
