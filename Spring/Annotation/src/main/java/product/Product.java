package product;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("p1")
public class Product {
	@Value("1")
	private int id;
	@Value("laptop")
	private String pname;
	@Value("hp")
	private String pbrand;
	@Value("10000")
	private double price;

	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", pbrand=" + pbrand + ", price=" + price + "]";
	}
}
