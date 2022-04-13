package digdo;

public class ActionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Action action = new Action () { //익명의 클래스로 익명의 객체생성 -> action
			public void work() {
				System.out.println("복사를 합니다.");}
			};
			action.work();
	}

}
