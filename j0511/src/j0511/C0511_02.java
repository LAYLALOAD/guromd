package j0511;

import java.util.Scanner;

public class C0511_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int input = 0, num1 = 0, num2 = 0;
		
		// 사칙연산 프로그램
		while(true) {
			System.out.println("[ 사칙연산 프로그램 ]");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.err.println("0. 종료");
			System.out.println("원하는 번호를 입력하세요.>>");
			input = scan.nextInt(); //원하는 번호 입력받음.
			
			if (input==0) {
				System.out.println("프로그램을 종료합니다.");
				break; 
			}
			
						
			
			//숫자를 입력
			System.out.println("첫번째 숫자를 입력하세요.");
			num1 = scan.nextInt();
			System.out.println("두번째 숫자를 입력하세요.");
			num2 = scan.nextInt();
			
			//비교문 (조건문 if switch: 1번이냐 2번이냐 숫자가 딱 정해지기 때문에 swich를 활용하는 것이 좋다.)
			//조건문
			switch(input) {
			case 1:
				System.out.println("더하기 결과값 : "+(num1+num2));
				break;
			case 2:
				System.out.println("빼기 결과값 : "+(num1-num2));
				break;			
			case 3:
				System.out.println("곱하기 결과값 : "+(num1*num2));
				break;	
			case 4:
				System.out.println("나누기 결과값 : "+(num1/num2));
				break;	
		
				
				
			}//switch
			
			
		}//while
		
		
		
		
		
		
		
		
		
		
		
//		//무한반복
//		for(;;) { 
//			System.out.println("숫자를 입력하세요.");
//			int num = scan.nextInt();
//			if(num==0) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//		}
		
				
		
		
//		//무한반복
//		for(int i = 0; ; i++) { //조건식이 없으면 무한반복, //초기값이 없어도 무한 반복
//			System.out.println("프로그램 실행");
//		}
		
		
//		//무한반복
//		while(true) {
//			System.out.println("숫자를 입력하세요.");
//			int num = scan.nextInt();
//			if(num==0) {
//				//프로그램을 종료
//				break; //반복문은 break를 만나면 종료 
//			}
//		}
		
		
		
		
		
//		//무한반복
//		while(true) {
//			System.out.println("프로그램 실행");
//		}
		
		
		//while로 한다면 프로그램이 바로 종ㄹ요된다.
//		int i = 10;
//		while(i<0) {
//			System.out.println("i의 값 : "+ i);
//		}
//		System.out.println("프로그램을 종료합니다.");
		
		
		//do while : 무조건 한번은 실행한다.
//		int i = 10;
//		do {
//			System.out.println("i의 값 : "+ i);
//		}while(i<0);

	}

}
