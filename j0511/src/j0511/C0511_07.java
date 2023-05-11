package j0511;

public class C0511_07 {

	public static void main(String[] args) {
	
		
		// 10개의 배열을 만들고 랜덤숫자 1-10까지 숫자를 입력해서 출력하시오.
		int[] num = new int[10]; //저장할 수 있는 공간
		for(int i=0; i<10; i++) {
			num[i] = (int)(Math.random()*10)+1;
			System.out.println(num[i]);
		}
			
			

		
		
//		// 배열 100개를 만들고 1 - 100 까지 숫자를 입력
//		int[] num = new int[100];
//		for(int i=0;i<100;i++) { //배열에서는 0부터 시작하는게 좋다 주소가 0부터 시작 하기때문
//			num[i] = i+1;
//			System.out.println(num[i]);
//		}
		
		
			
//		// int 배열
//		int[] num = new int[5];
//		num[0]=1;
//		num[1]=2;
//		num[2]=3;
//		num[3]=4;
//		num[4]=5;
//		
//		for(int i=0; i<num.length; i++) { //0,1,2,3,4 / 5를 써도 되지만 num.length를 쓰면 오류를 줄일 수 있다.
//			System.out.println(num[i]);
//		}
		

	}

}
