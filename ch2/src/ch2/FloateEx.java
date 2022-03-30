package ch2;

public class FloateEx {

	public static void main(String[] args) {
		// 실수(float point number) : 부동소수점수 -> float(4byte), double(8byte)
		int kor = 100;
		int eng = 70;
		int mat = 100;
		int tot = kor + eng + mat;	//정수와 정수의 연산결과는 정수가 나오므로 정수와 실수로 연산해야 실수 결과가 나온다.
		float avg = tot / 3.0f;		//평균은 소수범 이하가 나올 수 있으므로 "Float"/ 실수는 뒤에다가 'f'를 붙여준다.
		double pi1 = 3.1313; //더블은 f 생략이 가능
		float pi2 = 3.1313f; // 소수점은 'f'를 꼭써야 한다
		int radius = 20;
		float area = radius * radius * pi2;
		
		// 지수표기방법
		float data =3e6f; //3*10의6승 -> 지수
		float data2 = 3e-6f; //3*10의-6승 :0.0000003 -> 지수
				
		System.out.println("총점 : "+tot);
		System.out.println("평균 : "+avg);
		System.out.println("반지름이 20인 원의 면적 : " +area);
		//개발하고자 하는 프로젝트에 가장 적절한 규모를 정하고 타입을 결정해야 한다.
			//표현범위가 너무 적은 타입을 쓰면, 규모기 큰 데이터를 저장하거나 처리하지 못하므로 -> 타입밤위가 큰거를 사용.
			//표현범위가 너무 크면, 메모리를 많이 차지함으로 큰메모리가 필요하고 실행속도가 느려짐으로 -> 타입범위가 적은 것으로 사용.
		
		//shft + alt + y > 줄바꾸기 단축키
		}

}
