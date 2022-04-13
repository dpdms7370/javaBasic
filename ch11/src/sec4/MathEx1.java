package sec4;

public class MathEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int roll = Math.abs(-12);
		double roll2 = Math.abs(-23.32);
		
		// .ceil -> 올림 | .floor ->내림 | .int -> 반올림
		//Math.max(0,0) ->돗수부가장 큰수
		//Math.min(0,0) ->돗수부가장 작은 수
		
		
		System.out.println("-3.3=>" + Math.ceil(-3.3));
		System.out.println("-3.3=>" + Math.ceil(3.3));
		
		System.out.println("-3.3=>" + Math.floor(-3.3));
		System.out.println("-3.3=>" + Math.floor(3.3));
		
		System.out.println("-3.3=>" + Math.rint(-3.3));
		System.out.println("-3.3=>" + Math.rint(3.3));
		
		System.out.println("-3.3=>" + Math.round(-3.3));
		System.out.println("-3.3=>" + Math.round(3.3));
		
		System.out.println("-3.3=>" + Math.round(-3.7));
		System.out.println("-3.3=>" + Math.round(3.7));
		
		System.out.println("돗수분포에서 가장 큰 수 : "+Math.max(7, 5));
		System.out.println("돗수분포에서 가장 큰 수 : "+Math.min(7, 5));
		
		System.out.println("랜덤수 :"+Math.random());
		
		for(int i=0;i<100;i++) {
			System.out.println("랜덤수"+i+":"+((int)(Math.random()*10)+1);)}
		// 10 -> 종류수( 숫자10까지), +1은 스타트넘버자리 
		
		
		
		

	}

}
