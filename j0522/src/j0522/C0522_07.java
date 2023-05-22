package j0522;

public class C0522_07 {

	//C0522_07(){} // 기본생성자 자동생성
	
	
	int x;
	int y=x;
	char ch = ' ';
	String str;
	
	
	public static void main(String[] args) {
		int a = 0; //초기화
		int b = a;
		
		
		// a, b, x, y를 출력하시오.
		// 출력
		System.out.println(a);
		System.out.println(b);
		
		//객체선언 후 참조변수명.명수명
		C0522_07 c = new C0522_07();
				
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println("ch : "+c.ch);
		System.out.println("str : "+c.str);

	}//main

}//class
