package sec2;
//정적 블록
public class Class3 {
	
	int field1;
	void method1( ) {}
	static int field2;
	static void method2() {}
	
	static {
		field2 =100;
		method2();
	}
	
}
