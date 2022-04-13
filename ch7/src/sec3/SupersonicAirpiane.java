package sec3;

public class SupersonicAirpiane extends AirPlane {
	
	public static final int NORMAL = 1 ;
	public static final int SUPERSONIC =2;
	
	public int flyMode = NORMAL;
	
	@Override
	public int fly(){ 
		if(flyMode == SUPERSONIC) {System.out.println("초음속비행을 합니다.");} 
	else  {/*System.out.println("초음속비행을 합니다");*/ super fly();}
	
	} 
	


	
}
