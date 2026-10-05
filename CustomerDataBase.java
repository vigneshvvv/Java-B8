package sample;

import java.sql.SQLException;

public class CustomerDataBase {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DatabaseConfig config = new DatabaseConfig();
		config.getData();
		
		
		
		CustomerData customerData = new CustomerData();
		customerData.setCustomer_name("Rahul");
		customerData.setCountry("India");
		customerData.setAddress("afdasd");
		customerData.setMobileNumber("23412232");
		customerData.setEmilID("Data@gmail.com");
		config.insertData(customerData);
	}

}
