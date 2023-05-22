package j0522;

import java.util.Scanner;

public class C0522_04 {

	//매개변수가 있는 생성자를 사용
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 두수를 입력받아, 더하기, 빼기, 곱하기, 나누기
		// 생성자를 활용
		
		// 배열선언
		Data[] d = new Data[100]; //[100]에 있는 숫자만 바꾸면 수정이 가능하다. - 유지보수가 쉽다.
		int num1 = 0, num2 = 0;
		// Data 객체 사용하기
		// 객체선언
//		Data d = new Data();
		
		for(int i=0; i<2; i++) {
			System.out.println("1번째 숫자를 입력하세요.");
			num1 = scan.nextInt();
			
			System.out.println("2번째 숫자를 입력하세요.");
			num2 = scan.nextInt();
			
//			//객체선언 - 기본생성자
//			d[i] = new Data(); //기본생성자
//			d[i].num1 = n1;
//			d[i].num2 = n2;
//			d[i].data1 = d[i].num1+d[i].num2;
//			d[i].data2 = d[i].num1-d[i].num2;
//			d[i].data3 = d[i].num1*d[i].num2;
//			d[i].data4 = d[i].num1/d[i].num2;
			
			
			//객체선언 - 매개변수를 받는 생성자 활용
			d[i] = new Data(num1,num2); // 매개변수가 있는 생성자 활용
			
			
		}//for

	}

}


