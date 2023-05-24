package j0524_shopMall;

public class Washer extends Product {
	
	String color = "white";
	int weight = 20;
	
	Washer() {
		productName = "Bespoke";
		price = 120;
		bonusPoint = 12;
		sale = 10;
	}

	@Override
	public String toString() {
		return "구매 : "+productName;
	}
	
	
}
