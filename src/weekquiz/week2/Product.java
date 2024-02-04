package weekquiz.week2;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class Product {
	public String name;
	public BigDecimal price;
	public Double weight;

	private Product(){

	}

	public Product(String name, BigDecimal price, Double weight){
		this.name = name;
		this.price = price;
		this.weight = weight;
	}

	public Product(BigDecimal price, Double weight){
		this.price = price;
		this.weight = weight;
	}

	public Double getPrice() {
		return Double.valueOf(NumberFormat.getInstance().format(this.price).replace(",",""));
	}
}
