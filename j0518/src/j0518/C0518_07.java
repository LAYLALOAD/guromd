package j0518;

import java.util.Scanner;

public class C0518_07 {

	public static void main(String[] args) {
		// 1-100까지의 랜덤숫자를 생성해서 숫자를 맞추는 프로그램을 구현하시오.
		// 횟수 10번만 가능
		
		//입력받기 import
		Scanner scan = new Scanner(System.in);
		
		//변수선언
		int random = (int)(Math.random()*100)+1;
		int[] num = new int[10];
		
		//for문
		for(int i = 0; i < num.length; i++) {
			//1.숫자입력
			System.out.println((i+1)+"번째 숫자를 입력하세요.");
			num[i] = scan.nextInt();
			
			//2.비교 if(입력받은 숫자와 랜덤숫자가 같은지 비교)
			if(num[i] == random) {
				System.out.println("맞았습니다.");
				break;
			}else {
				if (i<9) {
					System.out.println("틀렸습니다. 다시 입력하세요.");
					System.out.println("--------------------------------");
				}else 
					System.out.println("틀렸습니다. 10번의 기회를 모두 사용하였습니다.");
			}
			
		}//for
		
		System.out.println("정답은 " + random +" 이었습니다 ㅋㅋㅋㅋㅋ 프로그램이 종료되었습니다.");
		//배열 출력
		System.out.print("당신이 입력한 10개의 숫자 : ");
		for(int i = 0; i <num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
	}//main

}//class
