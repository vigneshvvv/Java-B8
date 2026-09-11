package sample;

import java.util.List;

public class ProductInfo {
	
	int id;
	String productName;
	int price;
	List<Specification>  specification;
	
	public ProductInfo() {
		super();
	}

	public ProductInfo(int id, String productName, int price, List<Specification> specification) {
		this.id = id;
		this.productName = productName;
		this.price = price;
		this.specification = specification;
	}

	
	

	public List<Specification> getSpecification() {
		return specification;
	}

	public void setSpecification(List<Specification> specification) {
		this.specification = specification;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductInfo [id=" + id + ", productName=" + productName + ", price=" + price + ", specification="
				+ specification + "]";
	}

	

	
	
	

}
