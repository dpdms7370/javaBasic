package sec2;

public class MathRandom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d= 0, c= 0;
		while(d +c !=5) {
			d= (int) (Math.random()*6)+1;  // 난수 (무슨 수가 나올지 모르는 것.
			c= (int) (Math.random()*6)+1;
			System.out.println("("+d+", "+c+")");
		}
		
		// Math.random() 테그
		//값이 계속 소수로 떨어짐으로 정수로 할 경우엔 *6을 해준 뒤, 앞에 (int)로 강제 캐스팅하여, 앞의 정수만 남김
		//현 문제의 주사위값의 범위는 1-6임으로 +1을 통해여 설정해준다.
		//그후 system.out.println을통하여 출력값의 형태를 정하여 준뒤 출력.
		
		
		//중첩for문
		// x-> 1	2	3	4	5
		// y->1~10 1~10
	
		for(int x=1; x<=10; x++) {
			for(int y=1;y<=10;y++) {
				if(4*x +5*y == 60) System.out.println("("+x+","+y+")");
			}		
			}
		}

			// 

	}



