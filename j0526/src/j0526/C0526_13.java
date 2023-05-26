package j0526;

import java.util.Scanner;

public class C0526_13 {

	public static void main(String[] args) {
		
		
		//입력한 조와 숫자가 랜덤의 1조12587과 맞으면 당첨, 꽝 
		Scanner scan = new Scanner(System.in);
		String lotto1 = "1";
		
		int random = (int)(Math.random()*10);
		int random2 = (int)(Math.random()*100000); // 0-99999
		String strRandom = String.format("%05d", random2); //00000,09999,99999
		//System.out.println(random);
		//System.out.println(strRandom);
		System.out.println("조앞의 숫자와 5자리 숫자를 입력하세요. (예: 1조12587)");
		String strNum = scan.next(); //1조12587
		
		//조 부분
		String joNum = strNum.substring(0,1);
		int joNum2 = Integer.parseInt(joNum);
				
		System.out.println("당첨 조 : "+random+"조");
		System.out.println("입력 조 : "+joNum2+"조");
		if(joNum2 == random) {
			System.out.println("조 번호 당첨");
		} else {
			System.out.println("조 번호 꽝");
		}
		
		System.out.println();
		
		//5자리부분
		String oNum = strNum.substring(2);
		System.out.println("당첨 다섯번호 : "+strRandom);
		System.out.println("입력 다섯번호 : "+oNum);
		
		if(oNum.equals(strRandom)) {
			System.out.println("다섯번호 당첨");
		} else {
			System.out.println("다섯번호 꽝");
		}
		

		
		
		
		

	}

}
