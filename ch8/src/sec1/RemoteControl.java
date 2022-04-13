package sec1;
//기본이 다 추상화여서 앰트랙 안쓴다.
//
public interface RemoteControl {
	//인터페이스의 구성 멤버에서
	//메서드는 추상화되어 선언되어야함.
	//필드는 자연적으로 final static이 된다.
	public int MAX_VOLUME = 100;
	public int MIN_VOLUME = 0;
	public void turnOn( );
	public void turnOff( );
	public void setVolume(int volume);
	public int getVolume();
}
