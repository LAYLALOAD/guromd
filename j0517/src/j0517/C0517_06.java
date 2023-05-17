package j0517;

public class C0517_06 {

	public static void main(String[] args) {
		//
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x : "+d.x);
		
		System.out.println("------------------");
		d.x = change(d.x);
		System.out.println("change d.x : "+d.x);
		
	}
	
	static int change(int x) { //int가 아닌 void를 썼다면 return을 안쓰고 결국 'change d.x : 10' 나옴
		x=1000;
		System.out.println("x : "+x);
		return x;
	}

}
