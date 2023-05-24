package j0524;

public class C0524_02 {

	public static void main(String[] args) {

		//객체선언
		CaptionTv c = new CaptionTv();
		c.channelUp();
		System.out.println(c.channel);
		c.caption();
		
		//다형성: 부모의 참조변수로 자손의 객체를 다루는 것
		Tv t = new CaptionTv();
		t.channelUp();
		System.out.println(t.channel);
		//t.caption(); //공간은 있지만, t에는 메소드가 없어서 사용할 수 없음
		
		Tv t2 = new Tv();
		t2.channelUp();
		System.out.println(t2.channel); //1
		
//		CaptionTv c2 = null;
//		
//		t2 = c; // 부모 = 자식
//		c = (CaptionTv)t2; // 부모에 있는 것을 자손으로 보낼 때에는 강제형 변환을 해줘야 참조변수가 들어감
		

	}

}
