package sec1;
//기본 API : 미리 정해져잇는, 자바에서 제공해주는 참조형 (클래스)로 제공함 - java.lang.클래스이름, java.util.클래스이름
public class ClassNotFoundEx {

	public static void main(String[] args) {
		try {
			Class cl1 = Class.forName("java.lang.String2");
			System.out.println("해당 클래스 잘 있다!!!!");
			
		} catch(ClassNotFoundException e) {
			System.out.println("해당 클래스 없어유");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("알 수 없는 예외");
			
		} finally {
			System.out.println("프로그램 종료다!!!!!!");
			
		}

	}

}
//데이터를 주고 받거나 화일처리 등등 여러가지 작업을 할 때에도 모두 다 하는 것이 좋다.
//습관처럼 try catch문법을 외우시오.
//아이엘 Exception 과 유아이 Exception 둘다 중요 
