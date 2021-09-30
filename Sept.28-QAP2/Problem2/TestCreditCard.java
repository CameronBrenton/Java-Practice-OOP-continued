package Problem2;

public class TestCreditCard {
	public static void main(String[] args){

		Money money1 = new Money(35.444);

		System.out.println("This is the contents of the money object: " + money1.toString());

		Money money2 = new Money(23.00);
		money1.add(money2);
		System.out.println("The value of money1 after adding $23 is: " + money1.toString());

		Money money3 = new Money(11.11);
		money1.subtract(money3);
		System.out.println("The value of money1 after subtracting $11.11 is: " + money1.toString());

		Money money4 = new Money(10.00);
		Money money5 = new Money(10.50);
		System.out.println(money4.compareTo(money5));

	}
	
}
