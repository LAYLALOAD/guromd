package j0512;

import java.util.Scanner;

public class C0512_01 {

	public static void main(String[] args) {
		// 학생이름 국어 영어 수학 합계 평균 5개 _C0511_10 복기 test
		
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] total = new int[5];
		double[] avg = new double[5];
		
		for(int i=0; i<name.length; i++) {
		System.out.println("이름을 입력하시오.");  
		name[i] = scan.next(); //스캔출력 쓰는방법 까먹음
		System.out.println("국어 점수를 쓰세요.");
		kor[i] = scan.nextInt();
		System.out.println("영어 점수를 쓰세요.");
		eng[i] = scan.nextInt();
		System.out.println("수학 점수를 쓰세요.");
		math[i] = scan.nextInt();
		
		//자동계산
		total[i] = kor[i] + eng[i] + math[i];
		avg[i] = total[i]/3.0;
		}
		
		//출력
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("------------------------------------------");
		for(int i=0; i<name.length; i++) {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name[i],kor[i],eng[i],math[i],total[i],avg[i]);
		}



	
		
		
		
		
	}//main

}//class