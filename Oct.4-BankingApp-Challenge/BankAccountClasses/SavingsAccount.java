package BankAccountClasses;

public class SavingsAccount {
	private Person owner;
	private Money balance;

	public SavingsAccount(Person newAccountHolder, Money balance){
		owner = newAccountHolder;
		this.balance = balance;
		
	}

	public Money getBalance(){
		return balance;
	}

	public void transfer(Money amount){
		balance.subtract(amount);
		if(balance.compareTo(amount) == -1){
			balance.add(amount);
			System.out.println("The charge has been reversed. " +
			"You do not have enough funds to make this transfer");
		}
	}

	public String getPersonals(){
		return owner.toString();
	}
}
