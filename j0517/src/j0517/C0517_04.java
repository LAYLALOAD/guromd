package j0517;

import java.util.Scanner;

public class C0517_04 {

	public static void main(String[] args) {
		
		
		// 3개의 숫자를 입력받아 가장 작은 수를 출력하시오.
		Scanner scan = new Scanner(System.in);
		//객체선언 - 참조변수명.변수명, 참조변수명,메소드명()
		C0517_04 c = new C0517_04();
		
		//변수 설정
		int min = 0;
		int num1 = 0, num2 = 0, num3 = 0;
		
		//무한반복
		while(true) {
			System.out.println("1번째 수를 입력하세요.");
			num1 =scan.nextInt();
			System.out.println("2번째 수를 입력하세요.");
			num2 = scan.nextInt();
			System.out.println("3번째 수를 입력하세요.");
			num3 = scan.nextInt();
			
			//다른 메소드 호출시에도 참조변수명.메소드명 - 매개변수는 같아야함.
			int result = c.max(1, num1, num2, num3);
			int result2 = c.max(2, num1, num2, num3);
			
			System.out.println("3개의 수의 최대값 : "+result);
			System.out.println("3개의 수의 최소값 : "+result2);
		}//while
		
		
		
		
//		// 2개의 숫자를 입력받아 가장 큰 수를 출력하시요.
//		Scanner scan = new Scanner(System.in);
//		
//		// 변수 설정
//		int max=0;
//		int num1=0, num2=0;
//		
//				
//		//무한반복
//		while(true) {
//			System.out.println("1번째 수를 입력하세요.");
//			num1 = scan.nextInt();
//			System.out.println("2번째 수를 입력하세요.");
//			num2 = scan.nextInt();
//
//			System.out.println("두수에서 큰수 : "+Math.max(num1, num2));
//		}
		
		
		
		
		// 3개의 숫자를 입력받아 가장 큰 수를 출력하시오.
		// numMax 메소드를 만들어 사용하시오.
//		Scanner scan = new Scanner(System.in);
		
//		//객체선언
//		C0517_04 c = new C0517_04();
//		int[] num = new int[3];
//		//3개 숫자 입력
//		for(int i=0;i<num.length;i++) {
//			System.out.println((i+1)+"번째 숫자를 입력하세요.");
//			num[i] = scan.nextInt();
//		}
//		//메소드 호출
//		int result = c.numMax(num[0], num[1], num[2]);
//		System.out.println("결과값 : "+result);
		
		
	
		
		
		
		
//		//Math.Max()
//		max = Math.max(Math.max(num1, num2), num3);
		
		
//		//삼항식 활용
//		max = (num1>num2)?((num2>num3)?num2:num3):((num2>num3)?num2:num3);
		
		
		//if문 활용
//		//10,5,25
//		int max = 0;
//		int num1 = 10, num2 = 5, num3 = 25;
//		if(num1>num2) {
//			if(num1>num3) {
//				max = num1;
//			}else {
//				max = max3;
//		}else {
//			if(num2>num3) {
//				max = num2;
//			}else {
//				max= num3;
//			}
//		}
//	}
		
		

	}//main
	
	//메소드 리턴타입과 return 변수는 타입이 갈아야 함.
	int max(int check, int a, int b, int c) {
		int result = 0;
		if(check == 1) {
			//최대값 구하기
			result = Math.max(Math.max(a, b), c);
		}else {
			result = Math.min(Math.min(a, b), c);
		}
		return result;
	}
	
		
	
	
//	//numMax 메소드 만들기
//	int numMax (int a, int b, int c) {
//		int result = ;
//		return result;
//		
//	}

}//class
