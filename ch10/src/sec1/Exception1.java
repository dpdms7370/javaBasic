package sec1;
//예외처리 : 혹시모를 정상적인 실행을 하지 못 할 경우의 대비책을 마련하고, 실행되지 못할 대는 대비책을 가동하도록 하는 방안
public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		System.out.println("i="+i); // i는 초기화가 필요함
		int a =20;
		System.out.println("a를0으로 나눈 결과 : " +(a / 0));
		//예외상황(Exception) : 출력하는 내용에 null이 있어서 더 이상 셀행할 수 없은 ->NullPointer
		int [] arr = {10,20,30};
		String b = "김기태";
		//try { 실헹문장; } catch(예외종류코드 e) {예외를처리할구문;}
		
		try {
			System.out.println(Integer.parseInt(b));
			System.out.println(a / 0);
		} catch(NumberFormatException e) {
			System.out.println("정수로 빠꿀 수 없는 데이터 입니다.");
			e.printStackTrace();
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누려고 시도하였음");
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	}


//ArithmeticException 안에 Zero어쩌구가 들어감으로 저렇게 쓴것임.
//e.printStackTrace(); -> 오류난 곳의 주소를 알 수 있다.
// 예외상황의 종류와 ,