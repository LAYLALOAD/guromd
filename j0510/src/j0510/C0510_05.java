package j0510;

import java.util.Scanner;

public class C0510_05 {

	public static void main(String[] args) {
		
		// 97점 이상 A+, 93점 이하 A-, 87점 이상 B+, 83이하 B-
		int score = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		score = scan.nextInt();

		if(score >= 90) { //90, 91, 92, ..., 100
	    	System.out.print("A");
	    	if(score>97) {
	    		System.out.println("+");
	    	}else if(score<=93) { 
	    		System.out.println("-");
	    	}
    	}else if(score >= 80) { //80, 81, 82, ..., 89
	 	    System.out.print("B");
	    	if(score>87) {
	    		System.out.println("+");
	    	}else if(score<=83) { 
	    		System.out.println("-");
	    	}
    	}else if(score >= 70) { 
	 	    System.out.print("C");
	    	if(score>77) {
	    		System.out.println("+");
	    	}else if(score<=73) { 
	    		System.out.println("-");
	    	}
    	}else if(score >= 60) { 
	 	    System.out.print("D");
	    	if(score>67) {
	    		System.out.println("+");
	    	}else if(score<=63) { 
	    		System.out.println("-");
	    	}
    	}else { 
    		 System.out.println("F");
    	}
		
		
		
		
//		//점수를 입력받아, 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 그외 F
//		//1.변수 선언
//		int score = 0;
//		//2. scan
//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수를 입력하세요.");
//		score = scan.nextInt();
//		//3. 비교  4. 출력
//		if(score >= 90) { //90, 91, 92, ..., 100
//	    	System.out.println("A");
//    	}else if(score >= 80) { //80, 81, 82, ..., 89
//	 	    System.out.println("B");
//    	}else if(score >= 70) { 
//	 	    System.out.println("C");
//    	}else if(score >= 60) { 
//	 	    System.out.println("D");
//    	}else { 
//    		 System.out.println("F");
//    	}
		
			
		//char -> String으로 바꾼거 같은데 무슨 내용?????
//		String input = "";
//		char ch = ' ';
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자를 입력하세요.");
//		input = scan.next(); //문자열
//		ch = input.charAt(0); //문자열의 첫번째 문자를 가져옴
//		if(ch=='c'){ //기본형 8개 - boolean, char, byte, short, int, long, float, double
//			System.out.println("c 입니다.");
//		}else {
//			System.out.println("c가 아닙니다.");
//		}
		
				
		
//		String str = "";
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자열을 입력하세요.");
//		str = scan.next();
//		if(str=="C") { //기본형 8개 - boolean, char, byte, short, int, long, float, double //기본형이 아니라면 (String) .equals를 사용해야 한다.
//			System.out.println("c 입니다.");
//		}else {
//			System.out.println("c가 아닙니다.");
//		}

	}

}
