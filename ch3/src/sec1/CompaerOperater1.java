package sec1;

public class CompaerOperater1 {

	public static void main(String[] args) {
		// 비교연산 활용
		int a=30;
		int b= 20;
		String name="김수안무";
		System.out.println("a>b -> "+(a>b));
		System.out.println("a>=40 ->"+(a>=40));
		System.out.println("a<b ->"+(a<b));
		System.out.println("a<=40 ->"+(a<=40));
		System.out.println("a==b -> "+(a==b)); // = 하나는 저장한다는 의미 이므로 == 두개가 같다는 의미
		System.out.println("b!=30"+(b!=30)); //틀리면 트루
		System.out.println("name="\거북이\" -> "+(name=="거북이")); // 따옴표는 그냥쓰지않고 역슬래시표시를 해야 출력하는 따옴표가 된다.
		

	}

}
