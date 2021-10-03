//This is the TestCreditCard file

package Problem2;

public class TestCreditCard {
	public static void main(String[] args){

		// Create new Money object
		Money money1 = new Money(35.444);
		// Print the contents of the money object using toString()
		System.out.println("This is the contents of the money object: " + money1.toString());

		// Create new Address object
		Address address1 = new Address("15 Pleasant St.", "Toronto", "Ontario", "Y8N 2F5");
		// Print the contents of the Address object using toString()
		System.out.println("This is the contents of the new address object" + address1.toString());

		// Create new Money object
		Money money2 = new Money(23.00);
		// Add money2 object to money1 object
		money1.add(money2);
		// Print the contents of money1 object
		System.out.println("The value of money1 after adding $23 is: " + money1.toString());

		// Create new oney object
		Money money3 = new Money(11.11);
		// Subtract money3 object from money1 object
		money1.subtract(money3);
		// Print the contents of money1 object.
		System.out.println("The value of money1 after subtracting $11.11 is: " + money1.toString());

		// Create new Money object
		Money money4 = new Money(400.60);
		// Create new Money object
		Money money5 = new Money(350.20);
		// Call the compareTo() method on money4 object with money5 as the argument.
		System.out.println("Compare Method: " + money4.compareTo(money5));
		// Call the equals() method on money5 object with money4 as the argument.
		System.out.println(money5.equals(money4));
		// Call the compareTo() method on money5 object with money5 as the argument.
		System.out.println(money5.equals(money5));

		// Create the money object
		Money money6 = new Money(100.80);
		// Create the money object using the copy contructor
		Money money7 = new Money(money6);
		// Print result of calling the equals() method on money6 object with money7 as the argument.
		System.out.println("Overloaded the money7 constructer with the money6 object and the equals() method returns:" + money6.equals(money7));

		// Create new money object
		Money money8 = new Money(250.75);
		// Create new money object
		Money money9 = new Money(57.30);

		// Add money9 object to money8 object.
		money8.add(money9);
		// Print contents of money8
		System.out.println("Testing the add() method.   250.75 + 57.30 should equal 308.05" + money8.toString());

		// Subtract money9 object from money8
		money8.subtract(money9);
		// Print contents of money8 object.
		System.out.println("Testing the subtract method() by subtracting money9 from money8: " + money8);



	}
	
}
