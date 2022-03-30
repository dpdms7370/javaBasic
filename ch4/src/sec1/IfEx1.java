package sec1;

import java.util.Scanner;

//제어문 : 프로그랭밍에서 프로그램의 흐른을 제어하는 것으로
//조건분기문 : 조건에 따라 실행내용이 달라지게 하는 것(if, if/else, if/elseif/else)
//switch : 프로그래밍상 같은 실행문으로 여러 번 실행하게 하는 것 -> for, while, do~while
//기타제어문 => break, continue

public class IfEx1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String name = "남주혁";
		int kor =80;
		int eng =70;
		int mat =100;
		int tot = kor + eng + mat;
		String pass = "불합격";
		//if(조건식) {}
		if(tot>=200) {
			pass = "합격";
		}
		//if (tot>=200) pass="합격";
		pass = (tot>=200) ? "합격" : "불합격"; //-> 삼항연산자
		System.out.println("합격여부 :" +pass);
		if(kor>=90 || eng>=90 || mat>=90) {
			System.out.println("성적 우수상");
		} else {
			System.out.println("일반학생");}
		
		if(tot>=260) {
			System.out.print("A");
		}else if(tot>=250) {
			System.out.print("B");
		}else  {
			System.out.print("F");
			
		System.out.println("총 점수는"+"(kor+eng+mat)+"이고 "평균은 ((kor+eng+mat)/3)입니다.");
			
		}
	}
	
			// 연습예제
	
	
			int = eclips, pl, db;
			
			
			if(eclips>=70 && pl>=70 && db>=70) {
				System.out.println("합격여부 :" +pass);
			} 
			
			if(>=95 && eng>=95 && mat>=95) {
				System.out.println("특장학생");
			} else if(kor>=95 ||eng>=95 ||mat>=95) {
				System.out.println("과목장학생");
			}else {
				System.out.println("일반학생");
			}
		System.out.print("학점 : ");
		

		
		if(tot>=90) {
			System.out.print("A");
			if(tot>=98) {
				System.out.print("+");
			}else if(tot>=94) {
				System.out.print("0");
			}else {
				System.out.print("-");
			}
			
			if(tot>=78) {
				System.out.println("B");
				if(tot>=84) {
					System.out.print("+");					
				}else if (tot>=80) {
					System.out.println();
				}
					
				}
			}
	
			
		}
			
			}
}
