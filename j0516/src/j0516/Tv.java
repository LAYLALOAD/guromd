package j0516; 

public class Tv { //class 바로 밑에 있는 변수(instance 변수(객체변수)들에 디폴트가 들어가 있다. string-null, 불린-false
	String color;
	boolean power;
	int channel;
	int volume;
	
	
	void power() {
		power = !power;
	}
	void channelUp() {
		if(channel>=999) {
			channel=1;
			return;
		}
		channel++;
	}
	void channelDown() {
		if(channel<=1) {
			channel=999;
			return;
		}
		channel--;
	}
	void volumnUp() {
		if(volume >=100) {
			volume=100;
			System.out.println("볼륨은 100초과로는 올라가지 않습니다.");
			return;
		}
		volume++;
	}
	void volumnDown() {
		if(volume <=0) {
			volume=0;
			System.out.println("볼륨은 0미만로는 내려가지 않습니다.");
			return;
		}
		volume--;
		
		
		
	}
	
}
