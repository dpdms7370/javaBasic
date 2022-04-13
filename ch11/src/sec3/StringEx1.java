package sec3;

public class StringEx1 {
//String 생성자는 문자배열이나 바이트 배열을 문자열로 변환함
	public static void main(String[] args) {
		byte[] bytes = {77,33,110,67,34,69 };
		char[] chars = {'A','G','R'};
		String str1 = new String(bytes);
		System.out.println("str1="+str1);
		String str2 = new String(chars);
		System.out.println("str2="+str2);
		String str3 =new String(bytes,2,3); // String(문자열,시작인덱스,개수)
		System.out.println("str3="+str3);
		
		
		String data = "강하고 담대해라 옌";
		System.out.println(data.charAt(2)); // 큭정 인덱스 위치의 문자를 추출 - .charAt
		System.out.println(data.charAt(3));
		System.out.println("문자배열의 주소 : "+data.getBytes()); 
		System.out.println("옌의 위치 : "+data.indexOf("옌"));//특정 문자의 위치를 반환
		System.out.println("data의 글자수 : "+data.length()); //특정 문자의 글자수 변환 "()"를 안 쓰는건 배열
		String a = data.replace("옌", "예은"); //-> 치환, 변경
 		System.out.println(a);
 		String junum = "171717-012345"
		System.out.println("출생년도:"+junum.substring(0, 2)); //begin 이상 ~ end미만 
		System.out.println("성별 : ");
		int ma = Integer.parseInt(junum.substring(7, 8));
		switch (ma) {
		
		case 1:
		case 2:
			System.out.println("사람\n");
			break;
		case 0:
		case 3:
			System.out.println("외계인\n");
		default:
			System.out.println("잘못된 코드\n");
		}
		System.out.println("주민번호 뒷자리 : "+junum.substring(7)); //end생략시 끝까지
		
		String learn = "Java Web Programming";
		System.out.println("소문자로 : "+ learn.toLowerCase());
		System.out.println("대문자로 : "+ learn.toUpperCase());
		System.out.println("글자수: "+ learn.length());
		String gogo = learn.trim();
		System.out.println("공벡을 제거한 글자수: "+ (gogo.length()));
		System.out.println("공벡을 제거한 텍스트: "+ gogo);
		
		
		
		int b = 1717;
		float c = 12.1212f;
		String d = String.valueOf(b); //->문자형으로 바꿈
		int e = Integer.parseInt(d); //->숫자로 변경
		
		String f = String.valueOf(c); //문자열로 변경
		float g = Float.parseFloat(f); //문자열을 숫자실수로 변경
		
		
		
		String name1 = "송강";
		String name2 = "공지철";
		if(name1.equals(name2)) { //두 문자열 비교
			System.out.println("문자열 같아");
		} else {
			System.out.println("달라달라");
		}

	}

}



//각주로 써주신 것은 중요한 거다.
