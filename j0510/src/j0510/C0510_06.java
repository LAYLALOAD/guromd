package j0510;

import java.util.Scanner;

public class C0510_06 {

	public static void main(String[] args) {
		
		
		// 1. 변수선언 num1, num2, op 2.scan입력 3번 입력
		// 3. 비교(switch) 4.결과값 출력 - 더하기 결과값 : 4 (교수님 풀이+ result 사용)
		int num1=0, num2 =0, result=0;
		char op = ' ';
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		num1 = scan.nextInt();
		System.out.println("숫자를 입력하세요.");
		num2 = scan.nextInt();
		System.out.println("숫자를 입력하세요.");
		op = scan.next().charAt(0);
		
		switch(op) {
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1-num2;
			break;
		case '*':
			result = num1*num2;
			break;
		case '/':
			result = num1/num2;
			break;
		}
		System.out.println("결과값 : " +result);
		
				
		// 1. 변수선언 num1, num2, op 2.scan입력 3번 입력
		// 3. 비교(switch) 4.결과값 출력 - 더하기 결과값 : 4 (교수님 풀이: 변수 지정해서 바로 출력)		 
//		int num1=0, num2 =0;
//		char op = ' ';
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		num1 = scan.nextInt();
//		System.out.println("숫자를 입력하세요.");
//		num2 = scan.nextInt();
//		System.out.println("숫자를 입력하세요.");
//		op = scan.next().charAt(0);
//		
//		switch(op) {
//		case '+':
//			System.out.println("결과값 : "+(num1+num2));
//			break;
//		case '-':
//			System.out.println("결과값 : "+(num1-num2));
//			break;
//		case '*':
//			System.out.println("결과값 : "+(num1*num2));
//			break;
//		case '/':
//			System.out.println("결과값 : "+(num1/num2));
//			break;
//		}
				

		
		// 1. 변수선언 num1, num2, op 2.scan입력 3번 입력
		// 3. 비교(switch) 4.결과값 출력 - 더하기 결과값 : 4 (나의 풀이: 완료하지 못함 ㅜㅜ)				
//		double num1 = 0;
//		double num2 = 0;
//		char op = ' ';
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자1을 입력하세요.");
//		System.out.println("숫자2을 입력하세요.");
//		num1 = scan.nextInt();
//		num2 = scan.nextInt();		
//		op = scan.next().charAt(0); 
//		
//		switch(op) {
//		
//		case '+':
//			System.out.printf("결과:%f \n", num1 + num2);
//			break;
//		
//		case '-':
//			System.out.printf("결과:%f \n", num1 - num2);
//			break;
//			
//		case '*':
//			System.out.printf("결과:%f \n", num1 * num2);
//			break;
//			
//		case '/':
//			System.out.printf("결과:%.1f \n", num1 / num2);
//			break;
//			
//		}
//		
		

	}

}
