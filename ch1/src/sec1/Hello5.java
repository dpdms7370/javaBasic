package sec1;

import java.util.Scanner;

public class Hello5 {

	public static void main(String[] args) {
		// 저장소(변수)선언
		int kor, mat, eng;
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수 입력 : ");
		kor = sc.nextInt();
		System.out.println("수학점수 입력 : ");
		mat = sc.nextInt();
		System.out.println("영어점수 입력 : ");
		eng = sc.nextInt();
		System.out.println("당신의 총점은"+(kor+mat+eng)+"점이며, 평균은 "+((kor+mat+eng)/3)+"점입니다.");
	


	}

}