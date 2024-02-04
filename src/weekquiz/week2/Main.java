package weekquiz.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int goodsType = 0;
		double goodsWeight = 0.0;
		String goodsPrice = "";
		Product product;
		String totPrice;

		System.out.print("상품 종류를 번호로 입력해주세요!\n");
		System.out.print("1. 식료품\n");
		System.out.print("2. 화장품\n");
		System.out.print("3. 대형가전\n");

		goodsType = Integer.parseInt(br.readLine());

		System.out.print("무게를 입력해주세요!\n");
		goodsWeight = Double.valueOf(br.readLine());

		System.out.print("상품 가격을 입력해주세요!\n");
		goodsPrice = br.readLine();

		switch (goodsType){
			case 1:
				product = new Grocery(goodsPrice, goodsWeight);
				totPrice = ((Grocery) product).getDelivrcyCharge();
				break;
			case 2:
				product = new Beauty(goodsPrice, goodsWeight);
				totPrice = ((Beauty) product).getDelivrcyCharge();
				break;
			case 3:
				 product = new LargeAppliance(goodsPrice, goodsWeight);
				 totPrice = ((LargeAppliance) product).getDelivrcyCharge();
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				return ;
		}


		System.out.format("입력한 %s의 배송비 포함 총 가격은: %s 입니다.\n", product.name, totPrice);
		System.out.format("배송비는 %s원입니다.", String.valueOf((Double.valueOf(totPrice.replace(",","")) - product.getPrice())));

		return ;
	}
}

