package j0525;

public class Unit {
	int hitPoint; 		//현재 체력
	final int MAX_HP; 	//체력 최대값
	
	Unit(){
		MAX_HP = 10;
	}
	
	Unit(int hp) {
		MAX_HP = hp;
	}

}
