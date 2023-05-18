package j0518;

import java.util.Scanner;

public class C0518_01 {

	public static void main(String[] args) {
				
		// 5! = 5 * 4 * 3 * 2 * 1;
		// for문으로 구현해 보세요.
		int num = 1;
		for(int i = 5; i > 0; i--) {
			num = num * i;	
			System.out.println("num : "+ num);
		}
		System.out.println("결과값 : "+ num);
		System.out.println("-------------------------------------------");
		
		
		
		//숫자를 입력받아 해당되는 팩토리얼을 구현하시오.
		Scanner scan = new Scanner(System.in);
		int num1 = 1;
		System.out.println("팩토리얼에 사용하는 숫자를 입력하세요.");
		int input = scan.nextInt();
		for(int i = input; i > 0; i--) {
			num1 = num1 * i;
		}
		System.out.println("결과값 : "+ num1);
		System.out.println("-------------------------------------------");
		
		
		
		//1. 1-10까지 합을 구하시오. 55
		int sum1 = 0;
		for(int i = 1; i <= 10; i++) { // for문 구조: 초기식 조건식 증감식 
			sum1 = sum1 + i; 
		}
		System.out.println("1-10까지 합 : "+ sum1);
		System.out.println("-------------------------------------------");
		
		
		
		//2. 1-100까지 합을 구하시오. 5050
		int sum2 = 0;
		for(int i = 1; i <= 100; i++) {
			sum2 = sum2 + i;
		}
		System.out.println("1-100까지 합 : "+ sum2);
		System.out.println("-------------------------------------------");
		
		
		
		//3. 1-1000까지 합을 구하시오. 500500
		int sum3 = 0;
		for(int i = 1; i <= 1000; i++) {
			sum3 = sum3 + i;
		}
		System.out.println("1-1000까지 합 : "+ sum3);
		System.out.println("-------------------------------------------");

	}//main

}//class
