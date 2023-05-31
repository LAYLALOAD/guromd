package j0531;

import java.util.List;

public class C0531_08 {

	public static void main(String[] args) {
		
		//DataClass - 기본형
		//객체선언
		DataClass d = new DataClass();
		int num1 = 10;
		int num2 = 5;
		int sum = d.numAdd(num1,num2);
		System.out.println(sum*2);
		
		
		//DataClass - 객체형
		int kor = 100;
		int eng = 100;
		int math = 99;
		Student s = d.stuAdd(kor,eng,math);
		System.out.println(s.getTotal());
		
		
		//DataClass - 컬랙션형		
		//학번과 이름을 출력하시오.
		List<Student> list = d.stuList();
		for(int i=0;i<list.size();i++) {
			System.out.printf("%d,%s \n",list.get(i).getStuNo(),list.get(i).getName());
			
		}//for
		
		
	}//main

}//class
