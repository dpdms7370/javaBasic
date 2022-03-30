package sec2;

public class ArithMatic2 {

	public static void main(String[] args) {
		// 연산 오류에 대한 예외
		// 믄법적 오류, 연산 오류, 논리 오류
		int a=25, b=0, c;
		String name = "누룽지";
		System.out.println("a/b ="+(a/b)); // b가 0이어서, 나누기 자체를 못함. //불능(무한대= Infinite)
		//System.out.println("a/c = "=(a/c)); -> 저장된 c의 값이 없음 null
		System.out.println("a%b = "+(a%b)); //a를 b로 나눈뒤 나머지 값이 없음 //부정(NaN = not a number)
		//System.out.println("a/name = "+(a/name)); -> 문자로 빼기, 곱하기 ,나누기는 안되고 더하기는 가능하다.

	}

}
