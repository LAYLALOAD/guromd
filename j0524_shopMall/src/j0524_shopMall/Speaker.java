package j0524_shopMall;

public class Speaker extends Product {
	
	int watt = 5;
	String bluetooth = "v4.2";
	
	Speaker() {
		productName = "Home mini";
		price = 50;
		bonusPoint = 5;
		sale = 5;
	}
	
	@Override
	public String toString() {
		return "구매 : "+productName;
	}
	
	

}
