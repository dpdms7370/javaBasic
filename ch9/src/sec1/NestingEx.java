package sec1;
// 중첩클래스 : 일반적이지는 않으나 개념은 알기
class A { //외부클래스
	int item1;
	static int item2;
	void function1 () {System.out.println("외부클래스 일반 메서드");}
	static void function2 () {System.out.println("외부 클래스 정적 메서드");} 
	class B { // 내부클래스
		B()  {} //내부 생성자
		int field1; // 내부필드
		void method () {} // 내부 메서드
		//static int field2;
		//static void method2;-> 내부 클래스에는 static 쓸 수 없다. 셋방살이다.
 	}

}

public class NestingEx {
	
	public static void main(String[] args) {
		A a = new A(); //외부 멤버의 접근 및 호출
		System.out.println(a.item1);
		System.out.println(A.item2);
		a.function1();
		A.function2();
		A.B b = a.new B(); // 내부 멤버의 접근 및 호출
		System.out.println(b.field1);
		b.method();
		
	}
}

//public 은 한 클래스에서 하나만.
//publicdl 이 걸려 있는 것이 메인이다.

//중첩 클래스에서 A에 중첩되어 있는 B클래스는 셋방살이를 하는 존재같다.
//A가 집주인 이라면 B는 자가가 아니기에 static도 못 쓰고, 호출도 주인을 건너서 받게 된다.
//흑흑흑흑 또르르 B클래스야 힘내.
//이건 흔한 것이 아니라 개념을 알아야하는 것임으로, 모두 자가로 집이 있기를 바란다!!!