package j0601;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StuProcess {
	Scanner scan = new Scanner(System.in);
	int stuNo;
	String name; 
	int kor,eng,math;
	String createDate, updateDate;
	
	//파일 저장하기
	void stuSave(List<Student> list) {
		// 파일저장
		String data = "";
		for(int i=0;i<list.size();i++) {
			data += String.format("%d,%s,%d,%d,%d,%s,%s\r\n",list.get(i).getStuNo(),list.get(i).getName().trim(),list.get(i).getKor(),list.get(0).getEng(),list.get(0).getMath(),list.get(i).getCreateDate(),list.get(i).getUpdateDate());
		}//for
		
		//String data = "1,홍길동,100,100,99\r\n2,유관순,99,99,98\r\n3,이순신,88,88,87\r\n";
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:/javaclass/savedata/student.txt");//,true 하면 덮어쓰기가 아닌 새로운 파일이 저장됨
			fw.write(data);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	
	//파일 읽어오기
	List<Student> stuRead(){
		List<Student> list = new ArrayList<>();
		//파일 읽어오기
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("c:/javaclass/savedata/student.txt"));
			String data ="";
			while(true) {
				data =br.readLine();
				if(data==null) break;
				String[] dataArr = data.split(","); //
				//System.out.println(data);
				stuNo = Integer.parseInt(dataArr[0]);
				name = dataArr[1];
				kor = Integer.parseInt(dataArr[2]);
				eng = Integer.parseInt(dataArr[3]);
				math = Integer.parseInt(dataArr[4]);
				createDate = dataArr[5];
				//updateDate = dataArr[6];
				list.add(new Student(stuNo,name,kor,eng,math,createDate));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		//파일 읽어오기
		return list;
	}
		
	//학생성적출력 - 리턴타입 메소드명
	List<Student> stuOutput(List<Student> list) {
		
		String[] title = {"학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수", "입력일", "수정일"};
		//출력
		System.out.println("[ 학생성적 출력화면 ]");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s \n",title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7],title[8],title[9]);
		System.out.println("-----------------------------------------------------------------------------------");
		for(int i=0; i<list.size();i++) {
			Student s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%s\t%s \n",s.getStuNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank(),s.getCreateDate(),s.getUpdateDate());
		}//for
		System.out.println();
		
		return list;
		
	}//stuOutput
	
	//학생성적입력 - 메소드: 리턴타입 메소드명  
	Map<String, Object> stuInput(List<Student> list, int stuCount) {
	
		//반복
		while(true) {
			System.out.println("[ 학생성적 입력 ]");
			System.out.println(stuCount+"번째 이름을 입력하세요.(0.이전페이지 이동)");
			name = scan.next();
			if(name.equals("0")) {
				System.out.println("[ 이전페이지 이동 ]");
				break;
			}
			System.out.println("국어점수를 입력하세요.");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			math = scan.nextInt();
			//날짜객체선언
			Date d = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			createDate = sdf.format(d);
			
			list.add(new Student(stuCount,name,kor,eng,math, createDate));
			
			stuCount++; //1증가
		}//while
		
		System.out.println();
		// list, stuCount 2개를 보내야함
		Map<String, Object> map = new HashMap<>();
		map.put("list", list); //list=list
		map.put("stuCount", stuCount); //stuCount=4
		
		return map;
		
	}//stuInput
}// class
