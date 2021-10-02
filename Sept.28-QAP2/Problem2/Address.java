package Problem2;

public class Address {
	private String street;
	private String city;
	private String state;
	private String zip;

	public Address(String street, String city, String state, String zip){
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String toString(){
		return "Address[" + street + ", " + city + ", " + state + ", " + zip + "]";
	}
}
