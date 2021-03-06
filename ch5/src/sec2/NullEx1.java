package sec2;

public class NullEx1 {

	public static void main(String[] args) {
		
		//int a = null; -> 기본형은 null값을 가질 수 없다.
		String b = null; //String은 기본형이 아니다.
		int c = 20; //기본형은 == 또는 !=로 비교할 수 있다.
		int d = 20;
		System.out.println("c==d : "+(c == d));
		System.out.println("c==d : "+(c!=d));
		
		int[] e = {10,20,30}; //참조형은 같은 데이터여도 저장소로 비교하는 것이기에 같지않다.
		int[] f = {10,20,30}; // 덩어리째 비교하는 것.
		
		System.out.println("e==f : "+(e==f));
		System.out.println("e!=f : "+(e!=f));
		
		System.out.println(e.equals(f)); // 참조형은e.equals(b), 각각의 주소르 비교하는 것.
		System.out.println("e==f: "+e.equals(f)); //-> 이렇게 표기해준다.
		
		String g = "김예은";
		String h = "김예은";
		System.out.println("g==h : "+(g==h));
		System.out.println("g!=h : "+(g!=h)); //문자열의 성격
		
		
		String j = new String ("김예은");	//new code를 선언하면
		String k = new String ("김예은"); // 참조형으로 변하여 주소를 비교함
		System.out.println("j==k : "+(j==k));
		System.out.println("j!=k : "+(j!=k)); 
		System.out.println(("j==k")+j.equals(k)); // 참조형을 비교하려면 이퀄스!! 스트링은 데이터값이 하나여서 트루
		
		
		
		

	}

}
