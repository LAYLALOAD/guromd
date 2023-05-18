package j0518;

import java.util.Scanner;

public class C0518_03 {

	public static void main(String[] args) {
		// Scanner - 입력할 받을 때만 쓴다.
		Scanner scan = new Scanner(System.in); //ctrl + shift + m : 라이브러리 import 받기
//		//숫자
//		int num = scan.nextInt();
//		double d = scan.nextDouble(); //실수 입력 받기
//		//문자
//		String str = scan.next(); // 문자 뒤 enter를 뱉어냄
//		String str = scan.nextLine(); // 다 받아냄
	
		//숫자 2개를 입력받아 (1,10) -> 1부터 10까지의 합을 구하시오.
		//첫번재 토막: 숫자 2개를 입력받아
		System.out.println("첫 숫자를 입력하세요.");
		int num = scan.nextInt(); //1
		System.out.println("끝 숫자를 입력하세요.");
		int num2 = scan.nextInt(); //10
		
		//if문 - 첫 숫자가 끝 숫자보다 클 경우
		int temp = 0;
		if(num>num2) {
			temp = num;
			num = num2;
			num2 = temp;
		}
				
		//두번째 토막: 1부터 10까지의 합을 구하시오		
		int sum = 0;
		for(int i = num; i <= num2; i++) {
			sum = sum + i;
		}
		System.out.println("첫 숫자에서 끝 숫자의 합: "+sum);
		

	}//main 

}//class
