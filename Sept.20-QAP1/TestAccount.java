public class TestAccount {
	public static void main(String[] args) {
		Account a1 = new Account("1", "Steve Pardy", 5000);
		System.out.println("Account 1: " + a1.toString());
		System.out.println("The balance of Account 1 is: $" + a1.getBalance());

		Account a2 = new Account("2", "Jane Stevens", 4000);
		System.out.println("Account 2: " + a2.toString());
		System.out.println("The balance of Account 2 is: $" + a2.getBalance());

		a1.transferTo(a2, 1000);

		System.out.println("The balance of Account 1 after the transfer is: $" + a1.getBalance());
		System.out.println("The balance of Account 2 after the transfer is: $" + a2.getBalance());
	}

}
