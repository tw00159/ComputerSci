package Bank;

public class tester
{
	public static void main(String [] args)
	{
		bankAccount johnCheckingAccount= new bankAccount();
		johnCheckingAccount.deposit(200);
		System.out.printf("John's Balance is %.2f and the charge is %.2f " ,
				johnCheckingAccount.getBalance(), 
				johnCheckingAccount.getCharge()); 
		bankAccount kimCheckingAccount = new bankAccount(10, 0.0);
		kimCheckingAccount.withdraw(25);
		System.out.printf("\nKim's Balance is %.2f and the charge is %.2f " ,
				kimCheckingAccount.getBalance(), 
				kimCheckingAccount.getCharge()); 
	}

}
