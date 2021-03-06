package sec4;

public class Child extends Parent {
	private int studentNo;
	Child() {
		this("신금희");//name 필드를 this()를 이용하여 아래 생성자로 값 전달
		System.out.println("Child() call");
	}
	Child(String name) {//name와 studentNo필드를 this()를 이용하여 아래 생성자로 값 전달
		this("신금희",7);
		System.out.println("Child(String name) call");
	}
	Child(String name, int studentNo) { //해당 name 필드는 부모 생성자를 호출
		super(name);
		this.studentNo = studentNo;
		System.out.println("Child(String name, int studentNo) call");
	} 
	
}
