package j0524;

public class C0524_01 {

	public static void main(String[] args) {
		// Singleton ss = new Singleton();
		Singleton ss = Singleton.getInstance(); // 싱글톤 패턴: 오직하나의 객체만 생성

		System.out.println(Singleton.getNum());

	}

}
