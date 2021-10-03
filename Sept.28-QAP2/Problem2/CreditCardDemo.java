//This is the CreditCardDemo

import Problem2.Address;
import Problem2.CreditCard;
import Problem2.Money;
import Problem2.Person;

// Demonstrates the CreditCard class
public class CreditCardDemo {
	public static void main (String [] args)
	{
		// final unchangeable money variables
		final Money LIMIT = new Money(1000);
		final Money FIRST_AMOUNT = new Money(200);
		final Money SECOND_AMOUNT = new Money(10.02);
		final Money THIRD_AMOUNT = new Money(25);
		final Money FOURTH_AMOUNT = new Money(990);

		//Create new Person object
		Person owner = new Person("Christie", "Diane", new Address("237J Harvey Hall",
		"Menomonie", "WI", "54751"));
		//Create new CreditCard object
		CreditCard visa = new CreditCard(owner, LIMIT);
		//Print info about cardholder
		System.out.println(visa.getPersonals());
		//Print balance
		System.out.println("Balance: " + visa.getBalance());
		//Print credit limit
		System.out.println("Credit Limit: " + visa.getCreditLimit());
		System.out.println();
		// Print "Attempt to charge 200"
		System.out.println("Attempt to charge " + FIRST_AMOUNT);

		//Charge FIRST_AMOUNT
		visa.charge(FIRST_AMOUNT);
		// Print balance
		System.out.println("Balance: " + visa.getBalance());
		// Print "Attempt to charge 10.02"
		System.out.println("Attempt to charge " + SECOND_AMOUNT);
		//Charge SECOND_AMOUNT
		visa.charge(SECOND_AMOUNT);
		//Print balance
		System.out.println("Balance: " + visa.getBalance());
		// Print "Attempt to pay 25"
		System.out.println("Attempt to pay " + THIRD_AMOUNT);
		// Payment of THIRD_AMOUNT
		visa.payment(THIRD_AMOUNT);
		// Print balance
		System.out.println("Balance: " + visa.getBalance());
		// Print "Attempt to charge 990"
		System.out.println("Attempt to charge " + FOURTH_AMOUNT);
		// Charge FOUTH_AMOUNT
		visa.charge(FOURTH_AMOUNT);
		// Print balance
		System.out.println("Balance: " + visa.getBalance());
		
	}
}
