package sec1;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1월:석류석 , 2월:자수정 , 3월:남옥 , 4월:다이아몬드 ,5월:비취 ,6월:진주 , 7월:홍옥 ,8월:감람석 ,9월:청옥 , 10월:오팔 , 11월:황옥 , 12월:터키석");
		
		System.out.println("태어난 월[1-12]");
		
		Scanner sc = new Scanner(System.in);
		int $$월 = sc.nextInt();
				switch ($$월) {
				case 1:
					System.out.println("석류석");
					break;
				case 2:
					System.out.println("남옥");
					break;
				case 3:
					System.out.println("자수정");
					break;
				case 4:
					System.out.println("다이아몬드");
					break;
				case 5:
					System.out.println("비취");
					break;
				case 6:
					System.out.println("진주");
					break;
				case 7:
					System.out.println("홍옥");
					break;
				case 8:
					System.out.println("감람석");
					break;
				case 9:
					System.out.println("청옥");
					break;
				case 10:
					System.out.println("오팔");
					break;
				case 11:
					System.out.println("황옥");
					break;
				default :
					System.out.println("터키석");
					break;
					
			
				}

	}

}
