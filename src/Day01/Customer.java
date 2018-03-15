package Day01;

public class Customer {
	private String nameCustomer;
	private int ageCustomer;
	
	
	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	public int getAgeCustomer() {
		return ageCustomer;
	}

	public void setAgeCustomer(int ageCustomer) {
		this.ageCustomer = ageCustomer;
	}

	public Customer() {
		this.setNameCustomer(null);
		this.setAgeCustomer(0);
	}

	public Customer(String nameCustomer, int ageCustomer) {
		super();
		this.setNameCustomer(nameCustomer);
		this.setAgeCustomer(ageCustomer);
	}
}
