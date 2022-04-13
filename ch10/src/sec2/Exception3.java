package sec2;
//예외 떠넘기기 : 메서드명 () throws 오류종루며류()
public class Exception3 {

	public void method1() throws ClassNotFoundException{
		method2(); //처리내용
		
	}
	public void method2 () {
	try {
		Class cla1 = Class.forName("java.lang.String2");
	}catch( ClassNotFoundException e) {
		System.out.println("해당 클래스가 존재하지 않음");
		e.printStackTrace();
	}catch( Exception e) { 
		System.out.println("알 수 없는 예외");
		e.printStackTrace();
	}finally { System.out.println("프로그램 종료"); }; }
}
