package j0517;

import java.util.Scanner;

public class C0517_02 {

	public static void main(String[] args) {
		C0517_02 c = new C0517_02();
		Scanner scan = new Scanner(System.in);
		int num1 = 10;
		int num2 = 5;
		
		//객체선언
		//클래스명 참조변수명 = new 클래스명();
		
		
		//두수를 입력받아 더하기,빼기,곱사기,나누기 결과값을 출력하시오
		int[] num = new int[2];
		for(int i=0;i<num.length;i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요.");
     		num[i] = scan.nextInt();
		}
		//더하기,빼기,곱하기,나누기 메소드 호출
		int reuslt1 = c.add(num[0],num[1]);
		int reuslt2 = c.sub(num[0],num[1]);
		int reuslt3 = c.multi(num[0],num[1]);
		double reuslt4 = c.div(num[0],num[1]);
		System.out.println("두수의 더하기 : "+reuslt1);
		System.out.println("두수의 빼기 : "+reuslt2);
		System.out.println("두수의 곱하기 : "+reuslt3);
		System.out.println("두수의 나누기 : "+reuslt4);
		
		
		
		
//		//두수를 입력받아 곱하기 결과값을 출력하시오
//		//for문 활용
//		int[] num = new int[2];
//		for(int i=0;i<num.length;i++) {
//			System.out.println((i+1)+"번째 숫자를 입력하세요.");
//			num[i] = scan.nextInt();
//		}
//		//곱하기 메소드 출력
//		int result = c.multi(num[0], num[1]);
//		System.out.println("두수의 곱하기 : "+result);
		
			
//		//두수를 입력받아 빼기 결과값을 출력하시오
//		//for문 활용
//		int[] num = new int[2];
//		for(int i=0;i<2;i++) {
//			System.out.println((i+1)+"번째 숫자를 입력하세요.");
//			num[i] =scan.nextInt();
//		}
//		//빼기 메소드 출력
//		int result = c.sub(num[0], num[1]);
//		System.out.println("두수의 빼기 : "+result);
					
		
//		//두수를 입력받아 더하기 결과값을 출력하시오.		
//		//두번 입력
//		System.out.println("1번째 숫자를 입력하세요.");
//		num1 = scan.nextInt();
//		System.out.println("2번째 숫자를 입력하세요.");
//		num2 = scan.nextInt();

//		//for문 활용
//		int[] num = new int[2];
//		for(int i=0;i<2;i++) {
//			System.out.println((i+1)+"번째 숫자를 입력하세요.");
//			num[i] = scan.nextInt();
//		}
//	
//		//더하기 메소드 출력
//		int result = c.add(num[0], num[1]);
//		System.out.println("두수의 더하기 : "+result);
		
	
	
	}//main
	
	//더하기 메소드
	int add(int num1,int num2) { //변수명을 다르게 써도 되나 맞춰주면 좋다.
		int result = num1 + num2;
		return result;
	}

	//빼기 메소드 sub
	int sub(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
	//곱하기 메소드 multi
	int multi(int num1, int num2) {
	int result = num1 * num2;
	return result;
  }
	
	//나누기 메소드 div
	double div(int num1, int num2) {
	double result = num1 / (double)num2;
	return result;
  }
	
	
	
}//class
