package sec1;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import org.w3c.dom.css.Counter;

public class Hello4 {

	public static void main(String[] args) {
		int kor;		//정수의 저장소 선언 - kor, mat, eng
		int mat;
		int eng; 
		Scanner sc = new Scanner(System.in);		//키보드 생성
		System.out.println("국어점수 : ");		//키보드에 입력한 내용을 정수로 저장
		kor = sc.nextInt(); 		//키보드에 저장한 정수를 kor에 저장
		System.out.println("수학점수 : ");		
		mat= sc.nextInt();		//키보드에 입력한 정수를 mat에 저장
		System.out.println("영어점수 : ");
		eng = sc.nextInt();		//키보드레 입력한 정수를 eng에 저장
		//전체 저장한 정보를 출력 
				System.out.println("당신의 총점은"+(kor+mat+eng)+"점이며, 평균은 "+(kor+mat+eng)/3+"입니다.");
	
		 


	}

}
	