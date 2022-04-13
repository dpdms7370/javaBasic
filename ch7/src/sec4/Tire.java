package sec4;

public class Tire {
	int maxRotation;
	int accRotation;
	String location;
	
	//순서중요
	Tire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
		
	}

	public boolean roll() {
		++accRotation; //-> 누적 회전수
		if(accRotation < maxRotation) {		
			System.out.println(location+"회전 바퀴수"+accRotation);
			System.out.println(location+"타이어의 잔여 회전수"+(maxRotation-accRotation));
			return true;} 
		else { System.out.println(location+"타이어 펑크");
				return false;}
		
			
		
	}
}
