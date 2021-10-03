// This is the CreditCard class

package Problem2;

public class CreditCard {
	//Class variables
	private Person owner;
	private Money balance;
	private Money creditLimit;

	//CreditCard parameterized constructor
	public CreditCard(Person newCardHolder, Money limit){
		balance = new Money(0);
		creditLimit = new Money(0);
		creditLimit = limit;
		owner = newCardHolder;
	}

	// gets the balance on the credit card
	public Money getBalance(){
		return balance;
	}

	// gets the credit limit on the credit card
	public Money getCreditLimit(){
		return creditLimit;
	}

	// This method adds the charge to the card using the money class's add() method. 
	// We use an if statement to check if the credit limit is exceeded and if it is, then reverse the charge using the money class's
	// subtract() method. We then print a message notifiying the user that the charge was revered because the credit limit was exceeded.
	public void charge(Money amount){
		balance.add(amount);
		if(balance.compareTo(creditLimit) == 1){
			balance.subtract(amount);
			System.out.println("Oops! Cannot exceed credit limit! The charge was reversed.");
		}
	}

	// We can make a payment on our account by using the money class's subtract method() on the balance.
	public void payment(Money amount){
		balance.subtract(amount);
	}

	// Print the credit card's owner's information using the Person.toString() method. This will return the info
	// last name, fist name, and home address.
	public String getPersonals(){
		return owner.toString();
	}
}
