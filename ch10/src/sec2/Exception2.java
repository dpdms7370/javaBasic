package sec2;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class cla1 = Class.forName("java.lang.String2");
		}catch( ClassNotFoundException e) {
			System.out.println("해당 클래스가 존재하지 않음");
		}catch( Exception e) { 
			System.out.println("알 수 없는 예외");
		}finally {System.out.println("종료"); }

	}

}
