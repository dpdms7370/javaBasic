package sec3;

public class ScoerProc {

	public static void main(String[] args) {
		// 2차원 배열
		String[] names = {"길정훈","김동협","김성민","김태균","신길호"};
		int[][] scores = {{90,75,100},{95,90,65},{80,85,95},{85,80,85},{70,90,80}};
		int[] tot = {0,0,0};
		float[] avg = {0.0f, 0.0f, 0.0f};
		int total = 0;
		float average = 0.0f;
		
		System.out.println("이름\t국어\t영어\t수학");
		for (int i=0; i<names.length; i++) {
			System.out.print(names[i]+"\t");
			for(int j=0; j<3; j++) {
				System.out.print(scores[i][j]+"\t");
				tot[j]+=scores[i][j];
			}
			System.out.println("\n");
		}
		//평균은 합을 모두 더한 후 나와서 구할 수 있다.
		// 
		
	
	}

}
