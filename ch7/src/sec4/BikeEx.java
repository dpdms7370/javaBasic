package sec4;

public class BikeEx {

	public static void main(String[] args) {
		Bike adult = new Bike("앞 바퀴","산악자전거",29);
		Bike kids = new Bike("뒷 바퀴","어린이자전거",10);
		
		kids.run();
		kids.funk();
		kids.stop();
		
		adult.run();
		adult.funk();
		adult.stop();
		
	
		
	}

}
