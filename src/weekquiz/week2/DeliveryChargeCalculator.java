package weekquiz.week2;
import java.math.BigDecimal;

public interface DeliveryChargeCalculator {
	static final double deliStand1 = 3.0;
	static final double deliStand2 = 10.0;

	public BigDecimal getDelivrcyCharge(double weight, BigDecimal price);
}
