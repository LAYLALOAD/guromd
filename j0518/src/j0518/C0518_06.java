package j0518;

import java.util.Scanner;

public class C0518_06 {

	public static void main(String[] args) {
		// 국어, 영어, 수학점수를 입력받아 평균점수가 90점 이상이면 A, 80점 이상 B, 70점 이상 C, 60점 이상이면 D, 이하는 F 
		// 97점 이상 A+ 93점 이하 A-, 87점 이상 B+ 83점 이하 B-,....
		
		Scanner scan = new Scanner(System.in);
		
		String [] title = {"국어","영어","수학"};
		int[] num = new int[3];
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(title[i] + " 점수를 입력하세요.");
			num[i] = scan.nextInt();
		}
		
		int sum = num[0] + num[1] + num[2];
		double avg = sum/3.0;
	
		
		if(avg >= 90) {
			System.out.print("A");
			if(avg>=97) {
				System.out.println("+");
			}else if(avg<=93) {
				System.out.println("-");
			}
		}else if(avg >= 80) {
			System.out.print("B");
			if(avg>=87) {
				System.out.println("+");
			}else if(avg<=83) {
				System.out.println("-");
			}
		}else if(avg >= 70) {
			System.out.print("C");
			if(avg>=77) {
				System.out.println("+");
			}else if(avg<=73) {
				System.out.println("-");
			}
		}else if(avg >= 60) {
			System.out.print("D");
			if(avg>=67) {
				System.out.println("+");
			}else if(avg<=63) {
				System.out.println("-");
			}
		}else
			System.out.print("F");

	}//main

}//class
