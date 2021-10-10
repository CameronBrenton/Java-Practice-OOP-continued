package BankAccountClasses;

public class UserAccount {
	private Person user;
	private String password;
	public String id;
	
	
	public UserAccount(Person person, String id, String password){
		user = person;
		this.id = id;
		this.password = password;
	}
}
