package sec4;

public class Car2 {// 또다른 방법
	Tire[] tire = {
			new Tire("앞 왼쪽",20),
			new Tire("앞 오른쪽",30),
			new Tire("뒤 왼쪽",24),
			new Tire("뒤 오른쪽",20)
	};
	public int run() {
		System.out.println("자동차가 달립니다.");
		for(int i=0;i<tire.length;i++)
			if(tire[i].roll()==false) {stop(); return i+1;}
		
		return 0; // 0 이라면 문제있는 타이어가 없는 것.
	}
	public void stop() {
		System.out.println("차가 멈춥니다");
	}
//객체명 instanceof 클래스명 : 
}
