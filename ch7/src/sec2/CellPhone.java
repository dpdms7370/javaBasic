package sec2;

public class CellPhone {
	String model;
	String color;
	
	
	
	 void powerOn() {
		System.out.println("전원을 켭니다");
	}
	 void powerOff() {
		System.out.println("전원을 끔니다");
	}
	 void bell() {
		System.out.println("벨이 울립니다");
	}
	void sendVoice(String message) {
		System.out.println("보낸 메세지 : "+ message);
	}
	void receiveVoice(String message) {
		System.out.println("받은 메세지 : "+ message);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다");
	}

}
