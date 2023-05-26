package j0526;

import java.util.Scanner;

public class C0526_08 {

	public static void main(String[] args) {
		//for문을 사용하여 몇번 나왔는지 확인하라
		
		Scanner scan = new Scanner(System.in);
		String str = "안녕하세요. 반갑습니다. 좋은 하루 되세요. 오늘은 불금요 완전 좋음요";
		
		System.out.println("찾고자 하는 문자를 입력하세요.");
		String search = scan.next();
		
		
		int count = 0; //찾는 문자 개수
		int searchNum = -1; //찾는 문자 위치
		while(true) {
			searchNum = str.indexOf(search,searchNum+1); //찾는 위치 메소드
			if(searchNum != -1) {
				System.out.println("찾는 문자 위치: "+ searchNum);
				count++;				
			}else {
				System.out.println("더 이상 찾는 문자가 없습니다.");
				break;	
			}
		}//while
		
		System.out.println("-------------------------------");
		System.out.println("총 찾은 문자 개수: "+count);
		System.out.println("프로그램을 종료합니다.");
		

	}//main

}
