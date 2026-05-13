//Method Overloading (Bank Scenario)
//Create a class LoanCalculator with two overloaded methods:
//calculateLoan(int amount)
//calculateLoan(int amount, double interestRate)
//Print loan details accordingly. Call both methods from main.

package OopsAssignment;

class LoanCalculator
{
	public double calculateLoan(int amount)
	{
		double total = amount + (amount * 0.05);
        return total;
	}
	
	public double calculateLoan(int amount, double interestRate)
	{
		double total = amount + (amount * interestRate / 100);
        return total;
	}
}
public class MethodOverloadingBankScenario {

	public static void main(String[] args) {

          LoanCalculator lc = new LoanCalculator();
          System.out.println(lc.calculateLoan(10000));
          System.out.println(lc.calculateLoan(10000, 10.5));

	}

}
