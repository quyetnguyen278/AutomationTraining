package Day01;

public class Villa {
	private int totalPrice;
	private int totalDate;
	private String name;
	private int numberBed;
	public int PRICE_ONEDATE = 10;
	
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getTotalDate() {
		return totalDate;
	}
	public void setTotalDate(int totalDate) {
		this.totalDate = totalDate;
	}
	public int getNumberBed() {
		return numberBed;
	}
	public void setNumberBed(int numberBed) {
		this.numberBed = numberBed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Villa(String nameVilla, Customer customer, int totalDate) {
		this.name = nameVilla;
		this.totalDate = totalDate;
	}
	public String getCustomerInVilla (Customer customer) {
		return customer.toString();
	}
	
	//@Override
	public int getNumberDateStayInResort(int money) {
		int date = 0;
		switch (money) {
		case 100:
			date = money/this.PRICE_ONEDATE;
			break;
		case 50:
			date = money/this.PRICE_ONEDATE;
			break;
		case 30:
			date = money/this.PRICE_ONEDATE;
			break;
		default:
			date = 1;
		}
		return date;
	}
	@Override
	public float getCostFinal() {
		return this.PRICE_ONEDATE*this.getTotalDate();
		
	}
}
