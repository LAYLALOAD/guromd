package j0519;

public class Student {

	//기본생성자: 매개변수가 하나도 없음
	Student(){} //클래스 이름고 같고 (){} cf 클래스 이름과 다르면 메서드(){}
	
	//메서드 오버로딩을 지원한다.
	//Student(String name){}
	
	Student(String n, int k, int e, int m){
		name = n;
		kor = k;
		eng = e;
		math = m;
		total = k+e+m;
		avg = total/3.0;
	}
		 
	 
	
	static String[] title = {"이름", "국어", "영어", "수학", "합계", "평균", "등수"};
	
	
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	void sum() {
		total = kor+eng+math;
	}
	
	void average() {
		avg = total/3.0;
	}
	
}
