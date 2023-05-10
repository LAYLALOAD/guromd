package j0510;

import java.util.Scanner;

public class C0510_08 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		//랜덤숫자 1-100까지의 랜덤숫자 1개를 출력하시오.
		int random = 0;
		random = (int)(Math.random()*100)+1;
//		System.out.println(random);	
		
		//숫자 맞추기 프로그램
		//10번
		int i = 1;
		while(i<=10) {
			System.out.println(i+"번째숫자를 입력하세요.");
			int input = scan.nextInt();
			if(input==random) {
				System.out.println("정답입니다.");
				break;
			}else if(input>random) {
				System.out.println("[ 오답 ] 입력한 숫자보다 작은 수 입니다.");
			}else {
				System.out.println("[ 오답 ] 입력한 숫자보다 큰 수 입니다.");
			}
				
			i++;
						
		}
		
		
		
		//for, while문 같다 (for)
//		for(int i=0; i<10; i++) {
//			System.out.println(i);
//		}
//		
		
		//for, while문 같다 (while)
//		//초기화
//		int i=0;
//		while(i<10) {
//			System.out.println(i);
//			i++;
//		}
	
		
		
//		//10에서 부터 2씩 감소
//		for (int i = 10 ; i >0; i=i-2) {
//			System.out.println(i);
//		}
		
		
		
//		//10에서 부터 1씩 감소
//		//i--, i-=1, i=i-1
//		//i++, i+=1, i=i+1
//		for (int i = 10 ; i >0; i--) { //i=i-1
//			System.out.println(i);
//		}
		
		
		
//		// 00 01 02 03 04 ... 09 10 11 ... 99
//		// 중첩(이중) for문을 사용해서 출력하시오.
//		for (int i = 0 ; i <= 9 ; i++) {
//			for (int j = 0 ; j <= 9 ; j++) {
//				System.out.printf("%d%d \n", i,j); // \n을 빼면 옆으로 나열 된다. j문 끝나고 print써주면 10행 기준으로 열이 나열된다.
//			}
//		}
		
		
//	    // 0-9까지 출력하시오.
//		for(int i=0;i<=9;i++) {
//        	System.out.println(i);
//        	}
		
		
		
		// 구구단
//		// 중첩(=이중) for문
//		for (int i = 2 ; i <= 9 ; i++) {
//			System.out.printf("[  %d 단  ] \n", i); 
//			for(int j = 1 ; j <= 9 ; j++) {
//				System.out.printf("%d * %d = %d \n", i,j,i*j);
//			}
//			System.out.println( ); //각 단 이후 빈 줄이 생긴다. (중요)
//		}
		
			
		
		// for 문 (printf 활용)
//		for (int i = 0 ; i <= 9 ; i++) {
//			System.out.printf("%d * %d = %d \n", i,i,i*i);
//		}
		
		
		
		// for 문 (println 활용)
//		for (int i = 0 ; i <= 9 ; i++) {
//			System.out.println(i +" * "+ i+" = "+(i*i));
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		// 숫자를 3번 반복해서 입력받아, 합을 출력하시오.
//		// 1. 변수선언 num, sum
//		// 2. scan 한 번 선언
//		// 3. 반복문
//		// 4. 숫자 입력 넣어줌
//		// 5. sum 변수에 더하기 해줌
//		// 6. sum을 출력
//		
//		Scanner scan = new Scanner(System.in);
//		int num = 0, sum = 0;
//		
//		for(int i = 0; i < 3; i++) {
//			System.out.println((i+1)+"번째 숫자를 입력하세요.");
//			num = scan.nextInt();
//			sum = sum + num;
//		}
//				
//		System.out.println("합계 : "+sum);
		

	
		// 반복문 - for(몇부터 몇가지 정확한 숫자가 있을 때 주로 사용함), while(그 외)

		// 1~100 숫자 나열 (마지막 값만 출력, 증감식 축약형으로 작성)
//		//i는 지역 변수
//		int sum = 0;
//		int i = 1;
//        for(i=1;i<=100;i++) {
//        	sum += i; //sum = sum + i;
//        		
//        }
//        System.out.println((i-1)+":"+sum);
		
				
//      // 1~100 숫자 나열 (마지막 값만 출력)
//		//i는 지역 변수
//		int sum = 0;
//		int i = 1;
//        for(i=1;i<=100;i++) {
//        	sum = sum + i;
//        		
//        }
//        System.out.println((i-1)+":"+sum);
				
		
		
//		//1~100까지의 합 (각 순서를 앞에 추가해줌)
//		int sum = 0;
//		
//        for(int i=1;i<=100;i++) {
//        	sum = sum + i;
//        	System.out.println(i+":"+sum);
//        }

        
        // 1~100 숫자 나열
//        for(int i=1;i<=100;i++) {
//        	System.out.println(i);
//        }

	}//main

}//class
