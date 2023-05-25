package j0525_stuProject2;

import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>(); //10명의 배열을 대신해서 적용
		StuProcess stuProcess = new StuProcess(); //객체선언
		int choice = 0; //선택변수
		String name="";
		int kor = 0, eng = 0, math = 0;

		
		//프로그램 진행 - 무한반복
		while(true) {
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 성적삭제");
			System.out.println("5. 학생검색");
			System.out.println("6. 등수처리");
			System.out.println("7. 오름차순 정렬");
			System.out.println("8. 내림차순 정렬");
			System.out.println("0. 프로그램 종료");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요.");
			choice = scan.nextInt();
			
			if(choice == 0) {
				System.out.println("[ 프로그램을 종료합니다. ]");
				System.out.println();
				break;
			}//if
		
			
			switch(choice) {
			
			case 1: //학생성적입력
				//StuProcess 클래스의 stuInput()메소드 호출
				stuProcess.stuInput(list);
				
				break;
				
			
			}//switch
			
		}//while
			
	}//main
		
}//class


