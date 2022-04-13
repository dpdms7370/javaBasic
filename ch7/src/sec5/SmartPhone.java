package sec5;
//구현 클래스
public class SmartPhone extends Phone{
	//오버라이딩 전까지는 에러난다.

	
	SmartPhone(String owner) {
		super(owner);
	}
	@Override
	void turnOn() {
		System.out.println("전원을 켭니다.");}

	@Override
	void turnOff() {
		System.out.println("전원을 끔니다.");}
	
	void internetSearch() {
		System.out.println("인터넷 검색을 랍니다.");
	}

}

//객체지향형의 특징 - 다형성(메소드 오버로딩, 메소드 오버라이딩),캡슐화, 정보은닉, 상속성, 추상화 => 계획은 클래스로 만들어 놓는다.
// 그 것들을 실행하려면 클래스로부터 인스턴스를 생성하여 활용.