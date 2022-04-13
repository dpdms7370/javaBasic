package sec3;

import java.util.regex.Pattern;

public class PetternEx1 {

	public static void main(String[] args) {
	
			//정규표현식(Regular Expression)=패턴(Pattern)
				//입력된 데이터가 원하는 형식이 맞는지 검증하게 하는 식
				//아이디, 비밀번호, 전화번호, 이메일, 주민번호 형식 등을 검증
				//한 개의 문자 [] -> [abc] : abc 중 하나의 문자를 포함하고 있는지
				//				[^abc] : 한 문자라도 a, b, c가 아니도록 제한
				//				[a-z] : a~z 영문 소문자가 포함되는지
				//				[a-zA-Z] : 영문 대문자나 소문자가 포함되어 있는지
				//				[a-zA-Z0-9] : 영문, 숫자가 포함되어 있는지
				//\d	-> 십진수 [0-9]를 말함
				//\s	-> 공백이 포함되어 있는지
				//\w	-> [a-zA-Z0-9]와 동일
				//?		-> 없음 또는 하나		kbs? -> kbs 또는 kbs1, kbsa
				//*		-> 없음 또는 한 개 이상 kbs* -> kbs 또는 kbs1234, kbs1
				//+		-> 한 개 이상			kbs+ -> kbs1, kbsa, kbs1234
				//{n}	-> \d{3}	: 숫자 3글자이어야함
				//{n,m}	-> \d{3,4}	: 숫자 3글자 또는 4글자이어야함
				//()	-> 그룹 (02|031)
				//|		-> 또는

		
		
		String best ="(034|055|010)-\\d{3,4}-\\d{4}";
		String [] db = {"010-0101-2020", "023-333-4444","055-1223-777"};
		for(String iso : db) {
			
			boolean ph = Pattern.matches(best,iso);
			
			if(ph) {
				System.out.println(iso+"는 정규 형식과 일치합니다.");
			}else {
				System.out.println(iso+"는 정규 형식과 일치하지 않습니다");
		}
	}
		
		System.out.println("*********************");
		String best2 = "\\w+@\\w+(\\.\\w+)?";
		String[] emails = {"ggg@naver.com","eee@hanmail.net","fffddd"};
		for(String email : emails) {
		boolean db =Pattern.matches(best2, email);
			
			if(db) {
				System.out.println(email+"은 패턴의 형식과 일치함");}
				else {
					System.out.println(email+"은 패턴의 형식과 일치");}
				
		}
		
	System.out.println("*********************************************");
	String pw = "\\w+{8.16}"
			
	
		
		

} }
