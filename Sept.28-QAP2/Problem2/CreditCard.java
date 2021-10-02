package Problem2;

public class CreditCard {
	private Person owner;
	private Money balance;
	private Money creditLimit;

	public CreditCard(Person newCardHolder, Money limit){
		balance = new Money(0);
		creditLimit = new Money(0);
		creditLimit = limit;
		owner = newCardHolder;
	}

	public Money getBalance(){
		return balance;
	}

	public Money getCreditLimit(){
		return creditLimit;
	}
}
