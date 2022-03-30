package sec1;
//클래스 : 설계도, 객체를 만들기 위한 틀
//클래스의 구성 : 멤버(변수)필드, 멤버 메서드, 생성자;
public class Sample1 {  //퍼블릭, 디폴트
	//멤버(변수)필드 : 해당 객체에 대한 특성을 저장하고 있는 객체에 달린 변수- 프라이빗, 퍼블릭,디폴트 
	int field1;
	float field2;
	double field3;
	short field4;
	boolean field5;
	String field6;
	
	
	//생성자(접근제어를 안쓴다.)
	//현재 클래스 이름과 똑같이  객체를 만들  수 있는 함수를 만드는데 그것을 생성자라 함.
	//Sample () {}
	//오버로딩 :같은 이름으로 매개변수의 개수나 타입을 달리하여 매서드나 함수를 정의하는 것.
	
	Sample1() {}
	Sample1(int field1) {
		this.field1 = field1;
		
	}
	Sample1(int field1, float field2) {
		this.field1 = field1;
		this.field2 = field2;
	}
	public void method1() { //멤버 메서드(Method)- 디폴트, 퍼블릭
		System.out.println("메서드1");
	}
	public int method2() {
		return this.field1;
	}
	public int getField1() {
		return field1;
	}
	public void setField1(int field1) {
		this.field1 = field1;
	}
	public float getField2() {
		return field2;
	}
	public void setField2(float field2) {
		this.field2 = field2;
	}
	public double getField3() {
		return field3;
	}
	public void setField3(double field3) {
		this.field3 = field3;
	}
	public short getField4() {
		return field4;
	}
	public void setField4(short field4) {
		this.field4 = field4;
	}
	public boolean isField5() {
		return field5;
	}
	public void setField5(boolean field5) {
		this.field5 = field5;
	}
	public String getField6() {
		return field6;
	}
	public void setField6(String field6) {
		this.field6 = field6;
	}


}
