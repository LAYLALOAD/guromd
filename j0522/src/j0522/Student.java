package j0522;

public class Student {
	
	
	static int count = 1000; // 클래스변수 :모든 클래스들이 공통으로 사용함
	int stuNo;
	String name; // 인스턴스변수
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	{ //초기화블럭 :생성자의 중복적인 요소를 뽑아내서 초기화블록에 넣는다.
		++count; //1001
		//stuNo = "2023"+ String.format("%04d", 1); // 2023 101 1001
		stuNo = count; //1001, 1002, 1003, 1004 ....	
	}
	
	Student(){ }
	
	Student(String name, int kor, int eng, int math){ // 지역변수		
		this.name = name; //좌 인스턴스변수, 우 지역변수
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}

}
