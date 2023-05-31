package j0531;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class C0531_05 {

	public static void main(String[] args) {
		//파일쓰기
		String str = "파일쓰기를 시작합니다.";
		File f = new File("c:/javaclass/savedata/c.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(f);
			fw.write(str);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("파일이 저장되었습니다.");
		
		
//		//파일 읽어오기
//		BufferedReader br = null;
//		try {
//			br = new BufferedReader(new FileReader("c:/javaclass/savedata/news.txt"));
//			while(true) {
//				String data = br.readLine();
//				if(data==null) break;
//				System.out.println(data);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				br.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
//		System.out.println();
		
	}//main

}//class
