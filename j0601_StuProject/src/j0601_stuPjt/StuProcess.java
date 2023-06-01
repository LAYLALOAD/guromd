package j0601_stuPjt;

import java.util.ArrayList;
import java.util.Scanner;

public class StuProcess {
	Scanner scan = new Scanner(System.in);
	int stuNo;
	String name;
	int kor,eng,math;
	String createDate;
	
	// 학생성적입력 메소드 - 학번
	ArrayList<Student> stuInput() {
		ArrayList<Student> list = new ArrayList<>();
		System.out.println("[ 학생성적 입력 ]");
		System.out.println("1번째 학생번호를 입력하세요.");
		stuNo = scan.nextInt();
		System.out.println("1번째 이름을 입력하세요.");
		name = scan.next();
		list.add(new Student(stuNo,name));
		System.out.println("2번째 학생번호를 입력하세요.");
		stuNo = scan.nextInt();
		System.out.println("2번째 이름을 입력하세요.");
		name = scan.next();
		list.add(new Student(stuNo,name));
		
		
		return list;
	}

}
