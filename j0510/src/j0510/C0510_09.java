package j0510;

import java.util.Scanner;

public class C0510_09 {

	public static void main(String[] args) {
		// 10개의 숫자를 입력받아 합계를 출력하시오.

		//while문 사용
		Scanner scan = new Scanner (System.in);
		int num = 0, sum = 0, i = 0;
		while(i<10) {
			System.out.println((i+1)+"번째 숫자를 입력하세요.");
			num = scan.nextInt();
			sum = sum + num;
			i++;
		}
		System.out.println("합계 : "+sum);
		

		
		// 10개의 숫자를 입력받아 합계를 출력하시오. (나의 풀이: for문 사용)
//		Scanner scan = new Scanner (System.in);
//		int num = 0, sum = 0;
//		
//		for(int i = 0; i < 10 ; i++) {
//			System.out.println((i+1)+"번째 숫자를 입력하세요.");
//			num = scan.nextInt();
//			sum = sum + num;
//			
//		}
//				
//		System.out.println("합계 : "+sum);

	}//main

}//class
