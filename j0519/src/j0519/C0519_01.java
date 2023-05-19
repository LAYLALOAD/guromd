package j0519;

import java.util.Scanner;

public class C0519_01 {

	public static void main(String[] args) {

		// 변수선언
		Scanner scan = new Scanner(System.in);
		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		int choice = 0; // 선택번호
		int count = 0; // 성적입력 학생수

		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int[] rank = new int[10];

		// 무한반복
		while (true) {

			// 화면 출력 부분
			System.out.println("[ 학생성적처리프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 등수처리");
			System.out.println("5. 학생검색");
			System.out.println("0. 프로그램종료");
			System.out.println("-----------------------------'");
			System.out.println("원하는 번호를 입력하세요.");

			switch (choice) {

			case 1: // 성적입력

				// 이름 입력 부분
				for (int i = count; i < name.length; i++) {
					System.out.println((count + 1) + "번째 학생의 이름을 입력하세요.");
					name[i] = scan.next();

					// 이전페이지 이동확인
					if (name[i].equals("0")) {
						System.out.println("이전 페이지로 이동합니다.");
						System.out.println();
						break;
					}
					
					// 점수입력: score[i][0] - 국어, score[i][1] - 영어, score[i][2] - 수학
					for(int j = 0; j < score[i].length; j++) { //score[i].length = [i]이하 두번째 꺽쇠의 갯수이다. - 여기서는 3개(0, 1, 2)
						System.out.println(title[j+1]+"점수를 입력하세요.");
						score[i][j] = scan.nextInt();
						
					
						
					}

				} // for
				break;

			}// switch

		} // while

	}// main

}// class
