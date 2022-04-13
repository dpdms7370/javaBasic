package sec1;
// 클래스 -> 클래스 : extends
// 인터페이스를 클래스에게 상속할 때 : implements
public class TvRemote implements RemoteControl {
	int volume; //인터페이스로부터 상속박은 필드는 자동 private!! 그래서 실핼필드에선 게터세터로 이용해야함.
	int channal;

	@Override
	public void turnOn() {
		System.out.println("TV전원을 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV전원을 끔니다");
		
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		
	}

	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		return volume;
	}

}
