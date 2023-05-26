package j0526;

public class C0526_11 {

	public static void main(String[] args) {
		//
		String str1 = "https://semiconductor.samsung.com/kr";
		String str2 = "https://semiconductor.samsung.com/kr/dram/ddr.jsp"; //jsp: 자바에서스는 웹 파일
		String str3 = "https://semiconductor.samsung.com/kr/foundry/process-technology.jsp";
		String test = "abcdefghijklmn";
		String lotto = "1조198756"; 
		
		String result1 = lotto.substring(2); //2번 자리 숫자부터 끝까지
		System.out.println("lotto : "+result1);
		
		String result2 = test.substring(3,6); //3번 자리 부터 6번 앞자리까지 잘라와라
		System.out.println("test : "+result2);
		
		String result3 = str2.substring(36);
		System.out.println("str2 : "+result3);
		
		String result4 = str3.substring(36,45);
		System.out.println("str3 : "+result4);
		
		String result5 = str2.substring(str1.length());
		System.out.println("str2 : "+result5);
		
		
		
		
		

		
	}

}
