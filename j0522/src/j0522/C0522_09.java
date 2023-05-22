package j0522;

public class C0522_09 {

	public static void main(String[] args) {
		
		//객체선언 후 
		//serialNo = 1
		Product p1  = new Product();
		System.out.println("p1 count : "+Product.count); //클래스 변수는 공통이기때문에 참조변수명이 아닌 클래스 명을 쓸것
		System.out.println("p1 serialNo : "+p1.serialNo);
		
		//serialNo = 
		Product p2 = new Product();
		System.out.println("p2 count : "+Product.count);
		System.out.println("p2 serialNo : "+p2.serialNo);
		
		Product p3 = new Product();
		System.out.println("p3 count : "+Product.count);
		System.out.println("p3 serialNo : "+ p3.serialNo);
		
		//p1.count 얼마일까요?
		System.out.println("p1 count : "+Product.count);
		
		// int count = 0;
		// int cerialNo = 0;
		// 초기화블럭 : count = 1; serialNo = 1;
		// 생성자 :

	}

}
