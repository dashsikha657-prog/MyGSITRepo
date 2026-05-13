//Encapsulation + Validation Logic
//Create a class Account with private variables accountHolderName and balance.
//Provide setters and getters, where:
//setBalance() should not accept negative values (print a warning).
//Create an object and update values through setters only.

package OopsAssignment;

class Account
{
	private String accountHolderName;
	private double balance;
	
	public String getAccountHolderName() 
	{
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) 
	{
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double balance) 
	{
		if(balance < 0)
		{
			System.out.println("Warning: Balance cannot be negative!");
		}
		else
		{
		this.balance = balance;
		}
	}
	
	
}
public class EncapsulationValidationLogic {

	public static void main(String[] args) {

		Account acc = new Account();
 
        acc.setAccountHolderName("Sikha");
        acc.setBalance(5000);
        acc.setBalance(-200);  // invalid value

        
        System.out.println("Account Holder: " + acc.getAccountHolderName());
        System.out.println("Balance: " + acc.getBalance());

	}

}
