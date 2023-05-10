package j0510;

import java.util.Scanner;

public class C0510_03 {

	public static void main(String[] args) {
	
		
		// m,f 문자로 입력받아 m이면 납자입니다. f이면 여자입니다. 출력하시오 (강사님 풀이)
		//1.변수설정 2.scan 한후 변수입력받음 3. 비교 4. 출력
		String input = ""; //객체, 기본형 타입만 == 같다로 사용함, 객체는 .equals 사용
		Scanner scan = new Scanner(System.in);
		System.out.println("영문자를 입력하세요.");
		input = scan.next(); //문자열을 입력받음
		if(input.equals("m") || input.equals("M")) {
			System.out.println("남자입니다.");
		}else if(input.equals("f") || input.equals("F")) {
			System.out.println("여자입니다.");
		}else {
			System.out.println("다른 문자를 입력하셨습니다. 다시 입력하세요.");
		}
				
		
//		// m,f 문자로 입력받아 m이면 납자입니다. f이면 여자입니다. 출력하시오 (내 풀이)
//		//1.변수설정
//		char str = ' ';
//		//2.scan 한 후 변수 입력 받음
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자를 입력하세요.");
//		str = scan.next().charAt(0);		
//		//3.비교		4.출력
//		if(str == 'm' || str == 'M') {
//			System.out.println("남자입니다.");
//		}else if (str == 'f' || str == 'F') {
//			System.out.println("여자입니다.");
//		}
				
		
//		// 입력한 숫자가 1, 6, 9만 1,6,9입력받아 출력하시오. (강사님이 풀어주신 방법)
//		// if ,else if(), else
//		int input = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		input = scan.nextInt();
//		if(input == 1) {
//			System.out.println("1입니다.");
//		}else if(input == 6) {
//			System.out.println("6입니다.");
//		}else {
//			System.out.println("9입니다.");
//		}
		
		
//		// 입력한 숫자가 1, 6, 9만 1,6,9입력받아 출력하시오. (내가 푼 방법)
//		//1. 변수 선언
//		int num = 0;
//		//2. scan 한 후 변수 입력 받음
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		num = scan.nextInt();
//		if(num == 1 || num == 6 || num ==9) {
//			System.out.printf("결과값 : %d \n", num);
//		}else {
//			System.out.println("결과값이 나오는 숫자로 다시 쓰세요.");
//		}
		
		
//		// 점수를 입력받아 60점 이상이면 합격, 60점 미만이면 불합격을 출력하시오.
//		//1.변수선언   2.scan 한후 변수 입력 받음	3.비교	4.출력
//		int score = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수를 입력하세요");
//		score = scan.nextInt();
//		if(score >= 60) {
//			System.out.println("합격입니다.");
//		}else {
//			System.out.println("불합격입니다.");
//		}//if

	
		
				
	}//main

}//class
