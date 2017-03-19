package spring_first;

public class AddressP {
	private String street;
	private String postcode;
	public AddressP(String street, String postcode) {
		
		this.street = street;
		this.postcode = postcode;
	}
	@Override
	public String toString() {
		return "AddressP [street=" + street + ", postcode=" + postcode + "]";
	}
}
