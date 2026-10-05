package sample;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConfig {
	
	String hostName = "jdbc:mysql://localhost:3306/javatrainingpro";
	String user = "root";
	String password = "Vignesh333#";
	Connection connection;
	
	public void getData() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(hostName,user, password);
		Statement s = connection.createStatement();
		ResultSet result = s.executeQuery("select * from customers");
		
		List<CustomerData> customerDatas = new ArrayList<CustomerData>();
		
		while(result.next()) {
			CustomerData customerData = new CustomerData();
			customerData.setCustomer_id(result.getInt("customer_id"));
			customerData.setCustomer_name(result.getString("customer_name"));
			customerData.setAddress(result.getString("address"));
			customerData.setCountry(result.getString("country"));
			customerDatas.add(customerData);
		
		}
		
		System.out.println(customerDatas);
		
	
	}
	
	public void insertData(CustomerData customerData)  throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(hostName,user, password);
		PreparedStatement preparedStatement = connection
				.prepareStatement("insert into customers (customer_name, email_id, mobile_number,country)"
						+ " values (?, ?, ?, ?)");
		
		preparedStatement.setString(1,  customerData.getCustomer_name());
		preparedStatement.setString(2,  customerData.getEmilID());
		preparedStatement.setString(3,  customerData.getMobileNumber());
		preparedStatement.setString(4,  customerData.getCountry());
		
		preparedStatement.execute();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
