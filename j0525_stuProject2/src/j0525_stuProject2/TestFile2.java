package j0525_stuProject2;

public class TestFile2 {
	//printf와 String.format()의 비교설명
	public static void main(String[] args) {
		String name = "홍길동";
		int kor = 100;
		int eng = 99;
		int math = 90;
		System.out.printf("%s,%d,%d,%d \r\n",name,kor,eng,math);
		
		// String.format()과 printf와 같다 -> 좌측은 저장까지 가능, 우측은 출력
		String data = String.format("%s,%d,%d,%d \r\n",name,kor,eng,math); 
		System.out.println("문자열로 변수 저장 : "+data);
	}

}
