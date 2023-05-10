package j0510;

import java.util.Scanner;

public class C0510_07 {

	public static void main(String[] args) {

		//숫자를 입력받아 같은 값일 경우 당첨 그렇지 않으면 꽝 출력하시오. (교수님 풀이)
		int random = (int)(Math.random()*3)+1; //1.2.3
		int input = 0; 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		input = scan.nextInt();
		
		if(input==random) {
			System.out.println("당첨입니다.");
		}else {
			System.out.println("꽝입니다.");
		}
		
		System.out.println("랜덤숫자 : "+random);
		System.out.println("입력숫자 : "+input);
		
		
		
//		int random = (int)(Math.random()*3)+1; //1.2.3
//		//숫자를 입력받아 같은 값일 경우 당첨 그렇지 않으면 꽝 출력하시오. (나의 풀이)
//		//1. 변수설정
//		int num = 0;
//		
//		//2. scan
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		num = scan.nextInt();
//		
//		//3.비교
//		if (num == 1 || num == 2 || num == 3) {
//			System.out.println("당첨입니다.");
//		}else {
//			System.out.println("낙첨입니다.");
//	    }
//		

		
		
//		// 랜덤숫자
//		System.out.println(((int)(Math.random()*10)+1)); //1 ~ 10		

		
		
//		// 랜덤숫자
//		double random = 0;
//		random = (int)(Math.random()*5)+1; //1 ~ 5
//		System.out.println(random);	
	
		
		
//		// 랜덤숫자
//		double random = 0;
//		random = (int)(Math.random()*10); //0 ~ 9
//		System.out.println(random);		
		
				
		
//		// 랜덤숫자
//		double random = 0;
//		random = Math.random(); //0.0~0.999999999999999999999999999
//		System.out.println(random);

	}

}
