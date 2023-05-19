package j0519;

public class C0519_03 {

	public static void main(String[] args) {
		int a = 10, b = 5;
		int total = 0;
		
		System.out.println("[ 두수의 합 ]");
//		int total = a + b;
		total = C0519_03.total(a, b);
		
		System.out.printf("%d + %d = %d \n", a, b, total);

	}//main

	// 2개의 매개변수를 전달받아 합계:total 를 return 해서 출력을 하시오.
	//statuc:클래스메소드 int:리턴타입 total():메소드명 int a, int b
	static int total(int a, int b) {
		int total = a + b;
		return total;
	}
	
}//class
