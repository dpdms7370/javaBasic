package sec2;

public class WhileEx1 {

	public static void main(String[] args) {
		// 카운트변수의 초기화; while(조건식0 { 반복수행문; 증감식; }

		
		//예제- 1~100가지의 4의배수 합산결과를 출력
		
		int sum = 0;
		int d = 4;
		while(d<100) { 
				d+=4;
				sum += d;			//결과를 먼저 하느냐 아니면
		
		}
		
		System.out.println("4의 배수 합 : "+ sum);
	}

}
