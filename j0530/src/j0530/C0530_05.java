package j0530;

import java.util.ArrayList;

public class C0530_05 {

	public static void main(String[] args) {
		// list : 객체들의 집합, 데이터 이동 및 읽기, 저장용도로 사용
		ArrayList list = new ArrayList();
		list.add("abc"); //0
		list.add("abc"); //1
		list.add("bbb"); //2
		list.add("aaa"); //3
		list.add("ccc"); //3
		list.add(3); //Integer
		System.out.println(list.get(4));
		for(int i=0;i<list.size();i++) {
			System.out.println("list : "+list.get(i));
		}
		
		
		
//		ArrayList <Student> list2 = new ArrayList(); //지네릭스: 특정 클래스만 입력가능 add랑 for문만 알면 됨!!
//		list2.add(new Student(1, "홍길동", 100, 100, 99));
//		list2.add(new Student(2, "유관순", 90, 90, 99));
//		list2.add(new Student(3, "이순신", 80, 80, 87));
//		list2.add(new Student(3, "이순신", 80, 80, 87));
//		
//		for(int i=0;i<list2.size();i++) {
//			Student s = list2.get(i);
//			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f \n",s.getStuNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg());
//		}//for

	}//main

}//class