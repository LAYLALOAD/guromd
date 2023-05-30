package j0530;

import java.util.ArrayList;
import java.util.Iterator;

public class C0530_06 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1); //0
		list.add(2); //1
		list.add(3); //2
		list.add(4); //3
		list.add(5); //4
		list.add(6); //5
		list.add(7); //6
		System.out.println("현재: "+list.size());
		
		//list.remove(3);
		//list.remove(4);
		
		
		//Iterator 사용 출력: 컬랙션을 읽어오는 방법 - 예전버전 : Enumeration
		Iterator it = list.iterator(); //컬렉션을 읽어오는 객체
		
		while(it.hasNext()) { //데이터가 있는지 확인
			System.out.println(it.next()); //1개의 데이터를 가져옴.
		}
		
		Iterator it2 = list.iterator(); //컬렉션을 읽어오는 객체 -> 두번 반복하려면 객체를 한번 더 사용해야 한다. (참조변수명도 바꿔줘야함)
		
		while(it2.hasNext()) { //데이터가 있는지 확인
			System.out.println(it2.next()); //1개의 데이터를 가져옴.
		}
		
		
		
		
		
//		//전체삭제
//		for(int i=list.size()-1;i>=0;i--) {
//			System.out.println(list.remove(i));
//		}//for
//		
//		//for문 사용출력
//		System.out.println("출력 : "+list.size());
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}//for
		
		
		

	}//main

}// lass
