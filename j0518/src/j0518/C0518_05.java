package j0518;

import java.util.Scanner;

public class C0518_05 {

	public static void main(String[] args) {
//		// 숫자를 입력받아, 양수인지 음수인지 출력하시오. (0은 양수로 인정)
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("숫자를 1개 입력하세요.");
//		int num = scan.nextInt();
//		
//		if(num>=0) {
//			System.out.println(num+"은 양수입니다.");
//		}else {
//			System.out.println(num+"은 음수입니다.");
//		}
		
		
		
		//국어, 영어, 수학 입력받아 평균 60을 넘으면 합격, 불합격 출력하시오.
		Scanner scan1 = new Scanner(System.in);
		
		String [] title = {"국어","영어","수학"};
		int[] num1 = new int[3];
		
		for(int i = 0; i < num1.length; i++) {
			System.out.println(title[i] + "점수를 입력하세요.");
			num1[i] = scan1.nextInt();
		}
		
		int sum = num1[0] + num1[1] + num1[2];
		double avg = sum/3.0;
		
		
		if(avg >=60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		
		

	}//main

}//class
