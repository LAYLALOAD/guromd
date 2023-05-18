package j0517;

import java.util.Scanner;

public class C0517_05 {

	public static void main(String[] args) {
		// 3개의 수를 입력받아, 평균을 구하고 합격/불합격을 출력하시오. (평균 추가방법?)
		// average() return double
		Scanner scan = new Scanner(System.in);
		//객체선언
		C0517_05 c = new C0517_05();
		//변수선언
		int[] num = new int[3];
		double[] avg = new double[1];
		String result="";
				
		for(int i=0;i<3;i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요.");
			num[i] = scan.nextInt();
		}//3번만 입력 - 10 20 30,  90 90 80
		result = c.average(num[0], num[1], num[2], avg); //참조변수명.메소드명
		System.out.println("평균 : "+ avg[0]);
		System.out.println("합격여부 : "+result);

	}//main

	//합격 불합격 메소드 만들기
	String average(int a, int b, int c, double[] avg) {
		String result = "";
		avg[0]= (a+b+c)/3.0;
		if(((a+b+c)/3.0)>=60) {
			result = "합격";
		}else {
			result = "불합격";
		}
		return result;
	}
	
	
	
//	//평균 메소드 만들기
//	double average(int a, int b, int c) {  //여기 있는 변수명은 아무거나 작명해도 된다.
//		double result = (a+b+c)/3.0;
//		return result;	
//	}
	
}//class
