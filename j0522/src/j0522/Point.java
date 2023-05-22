package j0522;

public class Point {
	int x; //인스턴스 변수 - 객체선언후 참조변수명.변수명
	int y; //인스턴스 변수 - 객체선언후 참조변수명.변수명
	
	Point(){ //기본생성자 - 클래스명과 일치, void 없음
		this(0,0); //this: 다른 생성자 호출
	}
	
	Point(int x, int y){ //매개변수가 있는 생성자 - 클래스명과 일치, void 없음
		this.x = x; //this:인스턴스변수 x:지역변수 - 메소드 내
		this.y = y;
	}

}
