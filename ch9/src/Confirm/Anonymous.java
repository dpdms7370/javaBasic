package Confirm;

public class Anonymous {
	Vehicle field = new Vehicle() {
		@override
		public void run() { System.out.println("자전거가 달립니다.");};
	
	
	
	
			
	void method1() {
		Vehicle localVar = new Vehicle() {
			@override
			public void run() { System.out.println("승용차가 달립니다.");
			};
		};

						
		loclaVar.run();	 // 지역객체는 외부에서 인식을 하지 못하므오 여기서 실핼
		
	}

	void method2(Vehicle v) {
		v.run();
		
	}
	
