public class Account {
	private String id = "";
	private String name = "";
	private int balance = 0;
	static int count = 0;

	public Account(){
		id = "";
		name = "";
		balance = 0;
		count++;
	}
	public Account(String id, String name){
		this.id = id;
		this.name = name;
		this.balance = 0;
		count++;
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		count++;
	}

	public String getID(){
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBalance(){
		return balance;
	}

	public int credit(int amount){
		balance = amount + balance;
		return balance;
	}

	public int debit(int amount) {
		if (amount <= balance){
			balance = balance - amount;
		}
		else{
			System.out.println("Debit amount exceeded account balance");
		}
		return balance;
	}

	public int transferTo(Account account, int amount) {
		if (amount <= balance) {
			balance = balance - amount;
			account.credit(amount);
		}
		else{
			System.out.println("Amount exceeded account balance");
		}
		return balance;
	}

	public String toString() {
		return "Account[id= " + id + ", name= " + name + ", balance= " + balance + "]";
	}
}

