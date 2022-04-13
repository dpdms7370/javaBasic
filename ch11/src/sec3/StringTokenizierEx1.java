package sec3;

import java.util.StringTokenizer;

public class StringTokenizierEx1 {

	public static void main(String[] args) {
		// string 객체.split("구분기호);
		
		String str ="김태연&최수영,송강-김예은,효린-박성웅";
		String arr = str.split("&|,|-|%");
		
		for(String name : arr) {
			System.out.println(name);
		}
		
		System.out.println("------------------Tokenizer(for-countToken)--------------");
		//
		str = "신길호/여승원/이규진/이규호/신소희";
		StringTokenizer s = new StringToken(str,"/");
		int l =s.countTokens();
		for(int i=0;i<l;l++) {
			string t = s.nextToken();
			System.out.println(t);
		}
		
		
		System.out.println("------------------Tokenizer(while-hasMoreToken)--------------");
		StringTokenizer s2 = new StringToken(str,"/");
		while(s2.hasMoreTokens()) {
			String t2 =s2.nextToken();
			System.out.println(t2);
		}

	}

}
