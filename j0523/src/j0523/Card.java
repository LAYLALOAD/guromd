package j0523;

public class Card {
	
	static String[] kinds = {"Spade", "Heart", "Diamond", "Clover"}; 
	static String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	String kind;	//무늬 - 4가지 Spade, Heart, Diamond, Clover 
	int number;		//숫자 - 13가지 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11-J, 12-Q, 13-K
	
	Card(){
		this("Spade",1); //다른 생성자 호출
	}
	
	Card(String kind){
		this.kind = kind;
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	public String toString() { //객체의 참조변수를 호출하게 되면 객체에 들어가있는 값을 불러올 수 있다.
		String str = kind+","+number;
		return str;
	}

}
