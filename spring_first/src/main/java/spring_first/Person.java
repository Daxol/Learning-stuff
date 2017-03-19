package spring_first;

public class Person {

	private int id;
	private String name;
	private int taxId;

	private AddressP addressP;

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public Person(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public void speak() {
		System.out.println("Hello i'm a person");
	}

	public void setAddressP(AddressP addressP) {
		this.addressP = addressP;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", addressP=" + addressP + "]";
	}

}
