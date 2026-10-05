package sample;

public class CustomerData {
	int customer_id;
	String customer_name;
	String emilID;
	String mobileNumber;
	String address;
	String country;
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getEmilID() {
		return emilID;
	}
	public void setEmilID(String emilID) {
		this.emilID = emilID;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "CustomerData [customer_id=" + customer_id + ", customer_name=" + customer_name + ", emilID=" + emilID
				+ ", mobileNumber=" + mobileNumber + ", address=" + address + ", country=" + country + "]";
	}
	
	
	

}
