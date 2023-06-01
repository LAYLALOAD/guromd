package j0509;

import java.util.Scanner;

public class Class0509_07 {

	public static void main(String[] args) {
		// 숫자를 입력받아 짝수인지 홀수인지 출력하시오.
		// 짝수입니다. 홀수입니다.
		//1. 변수선언
		int input = 0;
				
		//2. Scanner - 입력 클래스
		Scanner scan = new Scanner(System.in);
		System.out.println("1개의 정수를 입력하세요");
		input = scan.nextInt();
				
		//3. 출력
		String answer = (input%2==0)?"짝수입니다.":"홀수입니다.";
		System.out.println(answer);

		
		
	}

}
