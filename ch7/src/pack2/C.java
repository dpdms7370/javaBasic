package pack2;
import pack1.A;
// import pack1.B; // B 클래스는 디폴트 값으로 다른 패키지에서 접근 제한됨. 
class C {
	 A a = new A(); //패키지가 달라서 import로 소환
	 //a.field1; - A클래스에 있는 field1은 접근제한다가 protected 이므로 같은 패키지 이거나 상속솬계에서만 가능하다.
	 
}
