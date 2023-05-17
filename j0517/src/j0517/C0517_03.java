package j0517;

import java.util.Scanner;

public class C0517_03 {

	public static void main(String[] args) {
		
		// 3개의 숫자를 입력받아 합계를 구하시오.
		// add메소드를 사용하시오.
		Scanner scan = new Scanner(System.in);
		
		//객체선언 - 클래스명 참조변수명 = new 클래스명();
		//객체선언
		C0517_03 c = new C0517_03(); //참조변수명은 클래스명과 동일하게 하거나(첫글자 소문자) 첫글자만 씀(소문자)
		int[] num = new int[3];
		//3개 숫자 입력
		for(int i=0;i<num.length;i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요.");
			num[i] = scan.nextInt();
		}
		
		//메소드 호출
		int result = c.add(num[0], num[1], num[2]);
		System.out.println("더하기 결과값 : "+result);
		
	}//main
	
	//add 메소드 만들기
	int add(int a, int b, int c) {
		int result = a+b+c;
		return result;
	}

}//class
