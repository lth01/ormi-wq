package weekquiz.week2;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class Grocery extends Product implements DeliveryChargeCalculator{
	private Grocery(){
		super("", BigDecimal.ZERO, 0.0);
	}

	public Grocery(String name, String price, double weight){
		super(name, new BigDecimal(price), weight);
	}

	public Grocery(String name, double price, double weight){
		super(name, BigDecimal.valueOf(price), weight);
	}

	public Grocery(String price, double weight){
		super("식료품",new BigDecimal(price), weight);
	}

	@Override
	public BigDecimal getDelivrcyCharge(double weight, BigDecimal price) {
		// 레퍼런스 세이프하게!

		BigDecimal totPay =  new BigDecimal("0").add(price);
		BigDecimal deliPay = new BigDecimal("0");

		// 무게 처리
		//3키로 미만
		if(Double.compare(DeliveryChargeCalculator.deliStand1, weight) > 0){
			deliPay = new BigDecimal("1000");
		}
		//3키로 이상 5키로 미만
		else if(Double.compare(DeliveryChargeCalculator.deliStand2, weight) > 0){
			deliPay =  new BigDecimal("5000");
		}else{
			deliPay =  new BigDecimal("10000");
		}

		// 가격에 따라 배달비 할인 폭 결정
		if(price.compareTo(new BigDecimal("30000")) < 0){
			// 	do noting
		}else if(price.compareTo(new BigDecimal("100000")) < 0){
			deliPay.subtract(new BigDecimal("1000"));
		}else{
			deliPay = BigDecimal.ZERO;
		}

		return totPay.add(deliPay);
	}

	public String getDelivrcyCharge(){
		return NumberFormat.getInstance().format(this.getDelivrcyCharge(this.weight, this.price));
	}
}
