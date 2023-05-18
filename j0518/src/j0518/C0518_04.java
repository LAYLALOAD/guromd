package j0518;

import java.util.Scanner;

public class C0518_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System. in);
		
		// 대문자를 입력받아 소문자로 변환하시오.
		System.out.println("대문자를 입력하면 소문자로 변환됩니다.");
		char ch = scan.next().charAt(0);
		ch = (char)(ch + 32);
		System.out.println(ch);
		
		
		
		// 소문자를 입력받아 대문자로 변환하시오.
		System.out.println("소문자를 입력하면 대문자로 변환됩니다.");
		char ch2 = scan.next().charAt(0);
		ch2 = (char)(ch2 - 32);
		System.out.println(ch2);
		
		
		
		// 대문자를 소문자로 소문자를 대문자로 변환하시오
		// 대문자 A-65~Z-96, 소문자 a-97~z-122
		System.out.println("대문자나 소문자를 입력하세요.");
		char ch3 = scan.next().charAt(0);
		
		//if문 활용 - 대문자인지 소문자인지 비교
		if(ch3<=96) {
			ch3 = (char)(ch3+32); 
		}else {		
			ch3 = (char)(ch3-32);
		}
		System.out.println(ch3);

		
		
	}//main

}//class
