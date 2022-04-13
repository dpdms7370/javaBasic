package sec4;

public class Car {

	
	Tire frontLeftTire = new Tire("앞왼쪽",77);
	Tire frontRihgtTire = new Tire("앞오른쪽",80);
	Tire backLeftTire = new Tire("뒤왼쪽",80);
	Tire backRightTire = new Tire("뒤오른쪽",90);
	
	public int run() {
		System.out.println("자동차가 달립니다.");
		if(frontLeftTire.roll()==false) {stop(); return 1;}
		if(frontRihgtTire.roll()==false) {stop(); return 2;}
		if(backLeftTire.roll()==false) {stop(); return 3;}
		if(backRightTire.roll()==false) {stop(); return 4;}
		return 0; // 0 이라면 문제있는 타이어가 없는 것.
	}
	public void stop() {
		System.out.println("차가 멈춥니다");
	}
	

}
