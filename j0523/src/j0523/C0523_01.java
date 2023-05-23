package j0523;

public class C0523_01 {

	public static void main(String[] args) {
		Deck d = new Deck();
		//Card[] c = new Card[52];
		
		//d.c[0].kind;
		for(int i=0; i<52; i++) {
			System.out.printf("%s,%d \n",d.c[i].kind,d.c[i].number);
		}

		
		
		


	}//main

}//class
