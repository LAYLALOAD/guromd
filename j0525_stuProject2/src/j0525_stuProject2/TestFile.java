package j0525_stuProject2;

import java.io.FileWriter;

public class TestFile {

	public static void main(String[] args) {
		
		String[] name = {"홍길동", "유관순", "이순신", "강감찬", "김구"};
		
		FileWriter fw = null;
		String data = "";
		//81~100점 사이의 랜덤 점수로 파일 저장하기
		try {
			fw = new FileWriter("c:/data/stduent.txt");
			for(int i=0;i<5;i++) {
				//1001,"홍길동",100,100,99;
				//1002,"유관순",100,100,90;
				//			  [   0-20               ] [81-100]
				int random1 = (int)(Math.random()*20)+81;
				int random2 = (int)(Math.random()*20)+81;
				int random3 = (int)(Math.random()*20)+81;
				data = data + String.format("%d,%s,%d,%d,%d\r\n", (Student.count+1),name[i],random1,random2,random3);
				Student.count++;
			}
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
		
		System.out.println("파일이 저장되었습니다.");

	}//main

}//class
