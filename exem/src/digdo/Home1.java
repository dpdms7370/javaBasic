package digdo;
import java.util.Scanner;

public class Home1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 5, 3, 8, 2};
		int i;
		int max = {0,0,0};
		for(int i=0; i<=array.length; i++) {
			 
			if(array[i]>max) {
			array[i]=max;
				
		}
		System.out.println("max: "+max);
		

	}

}

//8.

	public static void main(String[] args) {
		
	int[][] array = {
			{95,86},
			{83,92,96},
			{78,83,93,87,88}
	};
	int sum =0;
	double avg =0.0;
	
	int i=0;
	int j=0;
	int cnt;
	for(int i=0; i<=array.length; i++) {
		for(int j=0; j<=array{i}.length; j++) {
			cnt++;
		}
			sum+=array[i][j];
		}   
		avg= (float) sum / cnt;
	System.out.println("sum: "+sum);
	System.out.println("avg: "+avg);
	
	}

	//9.
	
	public static void main(String[] args) {
		
		boolean run =true;
		int studentNum =0;
		int[] scores = null;
		Scanner sacnner = new Scanner(System.in);
		
		while(run) {
			System.out.println("____________________");
			System.out.println("1.학생수 : 2.점수입력 : 3.점수리스트 : 4.분석 : 5.종료");
			System.out.println("______________________");
			System.out.println("선택>");
		
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) {
				System.out.println("학생수");
				studentNum = scanner.nextInt();
				scores = new int [studentNum];
			} 
			else if(selectNo == 2) {
				System.out.println("\nscore["+i+"] : "+score[i]);
				scores[i] = scanner.nextInt();
			}
			else if(selectNo ==3) {
				System.out.println("점수리스트");
			} 
			else if(selectNo==4) {
				System.out.println("분석");
			} 
			else if(selectNo==5) {
				run = false;
			}
						
		}
		System.out.println("프로그램 종료");
		
	}
	


	}
