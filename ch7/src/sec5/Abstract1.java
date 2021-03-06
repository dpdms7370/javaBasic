package sec5;
//Abstract (추상화) Class : 만약, 자세한 실행내용이나 값을 미리 지정하면, 나중에 이 클래스를 상속받아
//재사용할 경우 수정내용이나 메서드의 실행벙법이나 결과를 모두 일일히 편집하거나 오버라이딩 해야 함으로 
//재사용에 어려움이 많이 발생하여, 구체적인 내용은 기술하지 않고 두루물실하게 선언만 하여,
//상속받는 클래스에서 구체적인 내용을 기술해서 사용하게 해야하는 클래스이다.
//실제 사용시 여기저기 모두 사용할 수 있도록 구체적인 내용을 기술하여 사용하게 하는 클래스.
public abstract class Abstract1 {
	int field1; //필드 구체적인 값을 안 쓴다.
	Abstract1(){} //생성자
	abstract void method1(); // 메서드

}
