package sec2;

public class ForEx1 {

	public static void main(String[] args) {
		// for(초기값;조건식;증감식) { 반복실행할문장;}
		for(int i=1;i<=10;i++) {System.out.println(i+"번쨰-----");}
		//  	(1)(2)	(3)		(4)
		
		//(1) 은 처음 한번만 실행
		//(2) 실행
		//(4) 실행
		//(3) 실행
		//(2) 실행
		//(4) 실행
		//(3), (2), (4)를 (2)조건이 만족하는 동안에 반복
		for(int i=0;i<=10;i++) {
			if(i % 2 == 1) {	
				System.out.println("i="+i);
			}
		}
		if(i % 2 == 0){	
				continue; //건너띄기
				System.out.println("i="+i);
	}
	for(int i=1;i<=10;i+=2) {
		System.out.println("i="+i);
	}
	
	//i++, i+=1, sum=sum+i, sum+=i
	
	//1~100까지의 합계
	int sum =0;
	for(int i=1;i<=100;i++) {
		System.out.println("i="+i);
		sum+=i; //sum=sum+i
		System.out.println("sum="+sum);
		
		//i=0		1	2	3	4	5	6
		//sum=0		1	3	6	10	15	21 ...
	}
	System.out.println("1~100합계 : "+sum);
	//1~100까지의 3의 배수 합계 구하여 출력
	
	 sum = 0; //'i'는 자기가 마음대로 지정하는 카운트변수
	for(int i=3;i<=100;i+=3) {
		System.out.println("i="+i);
		sum+=i;
		System.out.println("sum="+sum);
	}
	
	sum =0;
	for(int d=3;d<=100;d+=3) {
		if(d/3=0 !) {
			continue;
	}

	
			
			

	}

}
