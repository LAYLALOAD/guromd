package j0509;

import java.util.Scanner;

public class Class0509_06 {

	public static void main(String[] args) {
		int num = 5;
		//int result = ++num; // num을 1을 더해서 그 결과값을 result 대입
		int result = num++; //result에 먼저 값을 대입한 후 num을 1을 더함.
		System.out.println(result);
		
		String answer = (num>1)?"1보다 큽니다.":"1보다 작습니다.";
		System.out.println(answer);
		
		// 1개의 정수형을 입력받아 10보다 큰수인지 출력하시오.
		//1. 변수선언
		int input = 0;
		
		//2. Scanner - 입력 클래스
		Scanner scan = new Scanner(System.in);
		System.out.println("1개의 정수를 입력하세요");
		input = scan.nextInt();
		
		//3. 출력
		String answer2 = (input>10)?"10보다 큽니다.":(input == 10)?"10과 같습니다.":"10보다 작습니다.";
		System.out.println(answer2);

		// 정수를 입력받아 음수면 양수로 양수면 음수로 변경하시오.
		System.out.println("음수는 양수로, 양수는 음수로 변경합니다. 숫자를 입력하세요.");
		input = scan.nextInt();
		int result2 = (input>0)?-input:-input;
		System.out.println("결과값: "+result2);
		
		
		
	}

}
