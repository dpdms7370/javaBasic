package sec4;

public class Bike extends Tire {

	String tirelocation;
	String model;
	double speed;
	
	public Bike(String tirelocation, String model, double speed) {
	
		this.tirelocation = tirelocation;
		this.model = model;
		this.speed = speed;
	}
	
	
	
	
	
	public void run() {
	System.out.println("자전거가 달립니다.");
	}
	public void funk() {
		System.out.println(tirelocation+"구멍이 났습니다.");
	}
	public void stop() {
		System.out.println("자전거가 멈춥니다.");
	}
	
	

}
