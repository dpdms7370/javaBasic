package sec3;

public  final class Member extends Human{ //final 클래스는 상속을 해줄 수 없다.
	String id;
	String pw;
	public void join () {
		System.out.println("화원가입");
	}
	public void login() {
		System.out.println("로그인");
	
	}
	public void modify() {
		System.out.println("화원 정보 수정");
	}
	

}
