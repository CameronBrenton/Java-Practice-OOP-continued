package BankAccountClasses;

public class UserAccount {
	private Person user;
	public String id;
	public String password;
	
	public UserAccount(Person person, String id, String password){
		user = person;
		this.id = id;
		this.password = password;
	}
}
