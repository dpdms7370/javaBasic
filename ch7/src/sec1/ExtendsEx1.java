package sec1;
//메인 클래스: 실행 클래스 라고도 하며, main()함수가 있어 실행이 가능하며, 반드시 public접근 제한자를 갖는다.
public class ExtendsEx1 {

	public static void main(String[] args) {
		
		Parent p1; //선언만 한 것이다.
		p1 = new Parent();
		p1.method1();
		p1.method2();
		
		//부모 클래스로 유도된 인스턴스는 자식 클래스간의 캐스팅이 가능하다.
		//물론 같은 부모 클래스로부터 유도된 것은 형제 자매끼리 서로 케스팅 가능.
		
		p1 = new Children();
		p1.method1();
		p1.method2();
		
		p1 = new Sister();
		p1.method1();
		p1.method2();
		
		p1 = new Brother();
		p1.method1();
		p1.method2();
		
	
	

	}

}
