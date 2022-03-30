package sec3;

public class Ex1 {

	public static void main(String[] args) {
		// 교과서연습문제
		
		
		//2. 32
		int x = 10;
		int y =20;
		int z = (++x) + (y--);
		System.out.println(z);
		
		
		//3. 가
		int scoer = 85;
		String result = (!(scoer>90))? "가" : "나";
		System.out.println(result);
		
		//4.
		int pencils = 534;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수
		int pencilsperstudent = (pencils/student) ;
		System.out.println(pencilsperstudent);	
		
		//남은 연필 수
		int penclisleft = pencils%student;
		System.out.println(penclislef);
//		
		//5.
		
		int value = 356;
		//356 % 300 =56 -> 356 - (356%300) => value - (value%300)
		System.out.println();
		
		//6.
		
		int lengthtop = 5;
		int lengthbottom = 10;
		int height =7;
		double area = (lengthtop+lengthbottom)/2.0f*height;
		System.out.println(area);
		
		
		//7.
		
		int x= 10;
		int y= 5;
		
		System.out.println((x>7) && (y<=5)); //-> 참 ( 둘중 하나가 참이면 참인 &)
		System.out.println((x%3 == 2) || (y%2 !=1)); // 거짓 (둘다 맞을 때 참)
		
		//8.
//		
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y; // NaN 숫자가 없어서 난  , x/y: Infinte -> 나눌 수 없어서 인피니티
		
		if ()      {
		System.out.println("0.0으로 나눌 수 없습니다."); // -> 영어로 나누기질문
		} else {
			double result = z +10;
			System.out.println("결과: " +result);
			
//			 Double.valueOf() => x = 이 메서드는 괄호 안의 값을 DOUBLE 타입의 실수로 변경 -> z = "NaN"
//					 Double.isNaN(z) => isNaN 값이라면, true, NaN 값이 아니면, false
//					 Double.isDouble(z) => a가 double 타입읠 데이터라면,true 아니면 false
//					 Double.isInfinite(z) => Infinition라면 true 아니면 false
		}
	
	}

}
