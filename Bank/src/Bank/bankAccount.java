/* This program models a bank account that is able to open a bank account with some amounts,j
 * deposit money, withdraw money, get the charge and the balance.
 * Taylor Wilson
 * Chapter Eight 
 */
package Bank;
import java.util.*;
public class bankAccount 
{

//s1. a data type called myBalance, and myCharge
private static double myBalance, myCharge;

//a default constructor that sets myBalance and myCharge to 0.00
public bankAccount()
{
	myBalance = 0.00;
	myCharge = 0.00;
/* a parameterized constructor that sets myBalance and myCharge to the given 
 * parameter pAmount and pCharge; using this reference to set private data.
 */
}
public bankAccount(double myBalance, double myCharge)
{
	this.myBalance= myBalance;
	this.myCharge = myCharge;
}
/*a mutator deposit that adds the given parameter pAmount to myBalance
 * Deposit the amount
 * @param pAmount the amount will be added to the balance
 * @return void
 */
public void deposit (double pAmount)
{
	this.myBalance += pAmount;
}
/*
 * a mutator withdraw that subtracts myBalance by the given 
 * pAmount if the myBalance is less than 10
 * then there will be a 15 charge
 * Withdraw money
 * @param pAmount the amount to be subtracted from the balance
 * @return void
 */
public double withdraw(double pAmount)
{
	this.myBalance -= pAmount;
	if(myBalance < 10)
	{
		myCharge += 15;
	}
	return pAmount;
	}

//s5a. an accessor getBalance that returns myBalance
double getBalance()
{
	return myBalance;
}
public double getCharge()
{
	return myCharge;

}



}




