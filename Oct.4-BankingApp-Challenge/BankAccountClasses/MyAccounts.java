package BankAccountClasses;
public class MyAccounts {
	private SavingsAccount savingsAccount;
	private CheckingAccount checkingAccount;

	public MyAccounts(){
		savingsAccount = new SavingsAccount(new Person("Cameron ", "Brenton", new Address("122 Lloyd Street", "St.Johns", "Newfoundland & Labrador", "EEE 222") ), new Money(100000000));
		checkingAccount = new CheckingAccount(new Person("Cameron ", "Brenton", new Address("122 Lloyd Street", "St.Johns", "Newfoundland & Labrador", "EEE 222") ), new Money(100000000));
		
	}
}
