package sec3;

public class Computer extends Calculator {
	
	@Override
	double areaCircle(double r) 
		 // 자식 클래스에서 의미가 재정의 되는 오버라이드!! 오버라이드의 'O'는 대문자여야 함.
	 {
		System.out.println("입력하신 반지름 : " +r+"의 원의 면적을 구합니다.");
			
		return Math.PI*r*r;
	} }


