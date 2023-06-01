package j0601;

import java.io.FileWriter;
import java.io.IOException;

public class C0601_03 {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:/javaclass/savedata/a.txt",true); //true는 새로만들기, false는 덮어쓰기
			String data = "안녕하세요. 오늘도 날씨가 좋아요.\r\n";
			fw.write(data);
			
			
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
		

	}

}
