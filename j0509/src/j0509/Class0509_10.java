package j0509;

import java.util.Scanner;

public class Class0509_10 {

	public static void main(String[] args) {
		// 실수 소수점차리 7자리까지 입력받아 소수점 4자리까지만 출력하시오.
		// 1. 변수 선언
		double num1 = 0;
		
		// 2. 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("실수 소수점 7자리까지 입력해주세요");
		num1 = scan.nextDouble();
		double result2 = (int)(num1*10000)/10000.0; // 이건 외우는거 공식임.
		
		// 3. 출력
		System.out.println(result2);
		
		
		
		//double num =564.124586 소수점 3자리 절사 2자리까지 존재
//		double num = 564.124586;
//		double result1 = (int)(num*100)/100.0;
//	    System.out.println(result1);
	    
		
		
		
//		double pi = 3.141592;
//		double result = (int)(pi*1000)/1000.0;
//		System.out.println(result);

	}

}
