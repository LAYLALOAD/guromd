package j0519;

import java.util.Scanner;

public class C0519_02 {

	public static void main(String[] args) {
		// 변수선언
		Scanner scan = new Scanner(System.in);
		Student[] s = new Student[10];
		int choice = 0;
		int count = 0;
				
		while(true) {
			System.out.println("[ 학생성적처리프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 등수처리");
			System.out.println("5. 학생검색");
			System.out.println("0. 프로그램종료");
			System.out.println("-----------------------------'");
			System.out.println("원하는 번호를 입력하세요.");
			choice = scan.nextInt();
			
			switch(choice) {
			
			case 1:
				for(int i = count; i < s.length; i++) {
					s[i] = new Student();
					System.out.println((i+1)+"번째 학생 이름을 입력하세요. (0. 이전 페이지 이동)");
					s[i].name = scan.next();
					if(s[i].name.equals("0")) {
						System.out.println("[ 이전 페이지로 이동합니다. ]");
						break;
					}
					System.out.println("국어 점수를 입력하세요.");
					s[i].kor = scan.nextInt();
					System.out.println("영어 점수를 입력하세요.");
					s[i].eng = scan.nextInt();
					System.out.println("수학 점수를 입력하세요.");
					s[i].math = scan.nextInt();
					
					s[i].sum();
					s[i].average();
					
					count++;
										
				}//for
				break;
				
			case 2:
				
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;
				
			case 5:
				
				break;
			
			default:
								
				break;
			
			
			}//switch
			
			
		}//while
		
		
		
		
		

	}//main

}//class
