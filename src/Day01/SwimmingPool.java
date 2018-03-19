package Day01;

public class SwimmingPool {

	private String openTime;

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	
	public SwimmingPool() {
		this.setOpenTime("9:00 am");
	} 
	
	public void getOpenTimeInScreen() {
		System.out.println("Swimming pool open at" +getOpenTime());
	}
}
