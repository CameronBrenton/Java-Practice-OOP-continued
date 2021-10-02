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

	public String getPersonals(){
		return owner.toString();
	}

	public void charge(Money amount){
		balance.add(amount);
		if(balance.compareTo(creditLimit) == 1){
			balance.subtract(amount);
			System.out.println("Oops! Cannot exceed credit limit! The charge was reversed.");
		}
	}

	public void payment(Money amount){
		balance.subtract(amount);
	}
}
