package sec2;

public class DmbPhone extends CellPhone {

	int channel;
	

    
	DmbPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("현재 "+this.channel+"번의 채널의 방송을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
	System.out.println("채널"+channel+"번으로 변경합니다.");
	}
	void turnoffDmb() {
		System.out.println("DMB방송을 종료 합니다.");
	}
	
}
