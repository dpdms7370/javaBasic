package sec2;

public class DmbCellPhoneEx{

	public static void main(String[] args) {
		
		 DmbPhone dmb1  = new DmbPhone("롤리팝","팡크",7);
		 
		
		
		 System.out.println("dmb의 모델: "+ dmb1.model);
		
		 System.out.println("dmb의 색상: "+ dmb1.color);
		
		 System.out.println("dmb의 채널:"+dmb1.channel);
		 
		 dmb1.powerOn();
		 dmb1.bell();
		 dmb1.sendVoice("여보세요");
		 dmb1.receiveVoice("안녕하셨습니까?");
		 dmb1.turnoffDmb(); 
		 dmb1.hangUp();
		 dmb1.changeChannelDmb(12);
		 dmb1.turnoffDmb();
		 dmb1.powerOff();
	
		
		

	}

}
