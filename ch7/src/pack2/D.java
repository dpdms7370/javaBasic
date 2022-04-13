package pack2;
import pack1.A;
public class D extends A{
	 A a = new A();
	 
	
	D(){
		super(); //반드시 슈퍼를 먼저 호출
		this.field1 =20 ;
		this.method1();}
}
// 부모 클래스중에 접근 제한자가 protected인 경우 생성자를 활용하여 접근해야함.