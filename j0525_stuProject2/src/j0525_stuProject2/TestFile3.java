package j0525_stuProject2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestFile3 {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("c:/data/stduent.txt")); //byte단위로 읽어온다.
			while(true) {
				String data = br.readLine(); //버퍼단위(라인단위)로 읽어온다.
				if(data == null) break; // 더이상 데이터가 없으면 종료
				System.out.println(data); //1001,홍길동,86,92,81 
				String[] dataArr = data.split(",");
				
				int stuNo = Integer.parseInt(dataArr[0]);
				String name = dataArr[1];
				int kor = Integer.parseInt(dataArr[2]);
				int eng = Integer.parseInt(dataArr[3]);
				int math = Integer.parseInt(dataArr[4]);
				// new Student(dataArr[0], dataArr[1], dataArr[2], dataArr[3], dataArr[4])
				
			}//while
			br.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
