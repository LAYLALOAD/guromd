package j0519;

import java.util.Scanner;

public class StuMain {

	//main 메소드
	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in); //scan이라는 클래스를 사용하기 위해 객체 선언
		Student[] s = new Student[10]; // 객체에 대한 배열을 선언 / s는 객체에 주소가 들어가 있는 배열
		int choice = 0; //원하는 번호 입력하는 변수
		int count = 0; //입력된 학생수
		int chk = 0; //학생이 있는지 확인하는 변수
		String searchName=""; //검색할 이름변수
		String name = "";
		int kor = 0, eng = 0, math = 0;
		
//		//7줄 -> 1줄 : Student[] s = new Student[10]; 과 같음
//		String[] name = new String[10]; //나중에 db(오라클)에 넣을 때 (java에는 날라가기때문에 저장할 수 없다) [][]을쓰면 배열을 컬럼안에 넣을 수 없다. 실제로 db에 넣을때는 컬럼이 한개만 들어간다, db를 사용하는 라이브러리 (myBatis, jpa)
//		int[] kor = new int[10];
//		int[] eng = new int[10];
//		int[] math = new int[10];
//		int[] total = new int[10];
//		double[] avg = new double[10];

		
		//반복문
		//while 조건이 있는 부분
			//조건문 if(조건별 1초), switch (각각 1초) 
		//for 횟수가 있는 부분
		
		//조건이 맞으면 실행 얘는 100% 맞기 때문에 무한반복이 된다.
		loop:while(true) {
			System.out.println("[ 학생성적처리프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 등수처리");
			System.out.println("5. 학생검색");
			System.out.println("0. 프로그램종료");
			System.out.println("-----------------------------'");
			System.out.println("원하는 번호를 입력하세요.");
			choice = scan.nextInt(); //원하는 번호 입력받기, scan에서 입력 받아야 하기 때문에 무한반복이 이 단계에서 멈춤
			
			//입력된 번호를 선택하는 조건문
			switch(choice) {
			
			case 1:
				//10명 성적을 입력하는 반복문 - 초기식; 조건식; 증감식
				for(int i=count; i<s.length; i++) { //s.length: s 객체에 대한 배열의 길이 (여기서는 10명) // count를 쓰는 이유: 나왔다가 다시 들어올 경우 입력된 학생수 다음 부터 진행 덮어쓰기 방지)
					System.out.println((i+1)+"번째 이름을 입력하세요.(0.이전페이지 이동)");
					name = scan.next(); // 이름입력 또는 이전페이지 이동입력
					//이전페이지 이동입력이 되었는지 확인 (같은지 비교 .equals, ==)
					if(name.equals("0")) {
						System.out.println("[ 이전페이지로 이동합니다. ]");
						break; //반복문(for, while) switch만 빠져나온다.(여기서는 for를 빠져나옴) - if와 상관 없음 cf. 메소드 뻐져나오는 것 return
					}//if - 3개로 나눠서 쓰는 이유는
					
					System.out.println("국어점수를 입력하세요.");
					kor = scan.nextInt();
					System.out.println("영어점수를 입력하세요.");
					eng = scan.nextInt();
					System.out.println("수학점수를 입력하세요.");
					math = scan.nextInt();
					
					//데이터값 뿐만 아니라 합계와 평균까지 다 받아서 준다. (합계와 평균을 별도로 호출하지 않아도 된다.)
					s[i] = new Student(name,kor,eng,math); //객체에 대한 선언: 객체를 사용할 수 있는 공간이 할당됨: 이름, 국어, 영어, 수학, 총계, 평균, 순위 / 배열선언 하는 자리에 쓰면은 안쓰는데 자리 차지하게 됨 그래서 쓸때 마다 선언하는게 유리함
										
					count++; //입력이 완료되면 입력된 학생수 1증가
					
				}//for
				
				break; //switch를 빠져나올 때 사용되는 구문
				
				
			case 2:
				System.out.println("[ 학생성적 ]");
				String[] title = Student.title; //Student.title이 길기 때문에 title로 임시로 변수 선언 
				//클래스 변수 사용방법: 클래스명. 변수명
				//상단 타이틀 출력
				System.out.println("recordTitle Student[] s : "+s);
				for(int i=0; i<title.length; i++) {
					System.out.print(title[i]+"\t");
				}
				System.out.println();
				System.out.println("-----------------------------------------------");
				//입력된 성적 출력
				for(int i = 0; i < count; i++) { 
					System.out.print(s[i].name+"\t");//s[i]는 주소값이 들어있음 거기에서 name
					System.out.print(s[i].kor+"\t");
					System.out.print(s[i].eng+"\t");
					System.out.print(s[i].math+"\t");
					System.out.print(s[i].total+"\t");
					System.out.printf("%.2f \t",s[i].avg);
					System.out.println(s[i].rank+"\t");
				}
				System.out.println();
							
				
				break;
				
			case 3://
				chk = 0; //0번으로 초기화 - 안쓰면 존재하지 않을때 출력되지 않는다.
				System.out.println("[ 학생성적 수정 ]");
				System.out.println("수정 할 학생의 이름을 입력하세요.(0. 이전페이지 이동)");
				searchName = scan.next();
				
				//0번 이전페이지 이동인지 비교
				if(searchName.equals("0")) {
					System.out.println("이전페이지로 이동합니다.");
					System.out.println();
					break; //switch
				}
				
				// 수정할 학생의 이름을 비교하기 위해 반복문
				for(int i=0; i<count; i++) {
					if(s[i].name.equals(searchName)) {
						System.out.printf("[ %s 학생이 검색되었습니다. ] \n",searchName);
						System.out.println("1. 국어점수");
						System.out.println("2. 영어점수");
						System.out.println("3. 수학점수");
						System.out.println("----------------------------");
						System.out.println("수정할 과목을 선택하세요.>>");
						choice = scan.nextInt();
						
						switch(choice) {
						
						case 1:
							System.out.printf("[ 이전 국어점수 : %d ]\n",s[i].kor);
							System.out.println("수정할 점수를 입력하세요.>>");
							s[i].kor = scan.nextInt();
							s[i].sum();
							s[i].average();
							System.out.println("[ 국어점수 수정완료 ]");
							System.out.println();
							break;
							
						case 2:
							System.out.printf("[ 이전 영어점수 : %d ]\n",s[i].eng);
							System.out.println("수정할 점수를 입력하세요.>>");
							s[i].eng = scan.nextInt();
							s[i].sum();
							s[i].average();
							System.out.println("[ 영어점수 수정완료 ]");
							System.out.println();
							break;
							
						case 3:
							System.out.printf("[ 이전 수학점수 : %d ]\n",s[i].math);
							System.out.println("수정할 점수를 입력하세요.>>");
							s[i].math = scan.nextInt();
							s[i].sum();
							s[i].average();
							System.out.println("[ 수학점수 수정완료 ]");
							System.out.println();
							break;
							
							
						}//switch
						
						chk = 1; //학생이 존재시 1로 변경
					}//if
					
				}//for
				
				//학생이 존재하지 않을 때 출력
				if(chk==0) {
					System.out.printf("[ %s 학생은 존재하지 않습니다. ] \n",searchName);
					System.out.println();
					
				}
				
				break; //switch
			
			case 4: //등수처리
				System.out.println("[ 등수처리 ]");
				//등수처리는 2중 for문을 써야 함
				for(int i=0; i<count; i++) { //등록된 학생수 만큼 비교
					int rankCount = 1; //등수가 1부터 시작하기 때문에 
					for(int j=0; j<count; j++) {
						if(s[i].total<s[j].total) {// 다른학생성적이 더 높으면 rankCount up 
							rankCount++;
						}
					}//for
					s[i].rank = rankCount; //변수를 등수변수에 저장
				}//for
				
				System.out.println("등수처리가 완료되었습니다.!!");
				System.out.println();
				break;
				
			
			case 5:
				System.out.println("[ 학생성적 검색 ]");
				System.out.println("학생이름을 입력하세요. (0. 이전페이지로 이동)");
				searchName = scan.next();
				
				//0번 이전페이지 이동인지 비교
				if(searchName.equals("0")) {
					System.out.println("이전페이지로 이동합니다.");
					System.out.println();
					break; //switch
				}
				chk = 0;
				for(int i=0; i<count; i++) {
					if(s[i].name.contains(searchName)) {
						
						chk = 1;
					}
				}//for
				
				//학생이 존재하지 않을 때 출력
				if(chk==0) {
					System.out.printf("[ %s 학생은 존재하지 않습니다. ] \n",searchName);
					System.out.println();
					
				}
				break;
				
			case 0: //if문의 else와 같다.
				System.out.println("[ 프로그램 종료 ]");
				break loop; //switch
				
			}//switch
			
			
		}//while
				

	}//main
	
	//성적 출력 메소드
	//recodTitle
		
	

}//class
