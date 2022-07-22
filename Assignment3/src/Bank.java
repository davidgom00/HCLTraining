/*iii)Create a Bank class with methods deposit & withdraw. The deposit method would accept attributes amount & balance ( returns the new balance which
is the sum of amount & balance. Similarly the withdraw method would accept the attributes amount & balance & returns the new balance
if(balance >=amount or return 0 otherwise
*/
public class Bank {
	public double deposit(double amount, double balance) {
		return (amount+balance);
	}
	
	public double withdraw(double balance, double withdraw) {
		double newBalance= balance - withdraw;
		
		if(newBalance <=0) {
			return 0;
		}
		else {
			return newBalance;
		}
	}
}
