package sec3;

public class StringBuilderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kim = "강감찬";
		String lee = "이소정" ;
		System.out.println(kim+","+lee);
		StringBuilder sb = new StringBuilder();
		sb.append("viva");
		sb.append("La");
		sb.append("Viva");
		System.out.println(sb);
		
		sb.insert(4, "!!");
		System.out.println(sb);
		
		sb.setCharAt(5, '7'); //특정 위치의 문자 바꾸기 (작은 따옴표)
		System.out.println(sb);
		
		sb.replace(8, 10, lee); //특정번째 문자열들을 바꾸기
		System.out.println(sb);
		
		sb.delete(3, 5); ///큭정 범위에 있는 문자열들을 바구기
		System.out.println(sb);
		System.out.println("글자수 :"+sb.length());
		String res = sb.toString(); // StringBuilder를 String으로 변환
		System.out.println("문자열로 변환된 결과 : "+res);
		StringBuilder sb2 = new StringBuilder(res); // String을  StringBuilder객체로 변환
	}

}
