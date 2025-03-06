package product;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
	@Id
	private int id;
	private String pname;
	private double price;
	private String brand;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String toString() {
		return "ID = "+id+" Product Name = "+pname+" Product Price = "+price+" Brand = "+brand;
	}
}
