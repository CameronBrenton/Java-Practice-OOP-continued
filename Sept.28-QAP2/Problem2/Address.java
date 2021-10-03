// This is the Address class.

package Problem2;

public class Address {
	// class variables
	private String street;
	private String city;
	private String state;
	private String zip;

	//Address parameterized constructor
	public Address(String street, String city, String state, String zip){
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	// toString() method
	public String toString(){
		return "Address[" + street + ", " + city + ", " + state + ", " + zip + "]";
	}
}
