package j0526;

import java.util.Scanner;

public class C0526_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String lotto1 = "1";
		//String lotto2 = "12587";
		// 1-9조 00000-99999
		// 0-9 랜덤숫자를 맞추는 게임을 구현하시오.
		
		// 랜덤숫자를 int random = 랜덤숫자
		// 입력숫자 : int myNum = 입력숫자, 1조
		// 당첨, 꽝을 출력하시오.

		
		int random = (int)(Math.random()*10);
		//System.out.println(random);
		System.out.println("N조를 입력하세요.(예.1조)");
		String strNum = scan.next(); //1조12587
		//String joNum = strNum.substring(0,1);
		int myNum = Integer.parseInt(strNum.substring(0,1)); //입력받은 문자열 1을 숫자 1로 변경
			
		
		System.out.println("당첨 조 : "+random+"조");
		System.out.println("입력 조 : "+myNum+"조");
		if(myNum==random) {
			System.out.println("당첨");
		} else{
			System.out.println("꽝");
		}
		
		
	}

}
