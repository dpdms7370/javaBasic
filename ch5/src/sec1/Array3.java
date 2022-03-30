package sec1;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"오성경", "우지원", "성주은", "김지희","이우진"};
		//5명의 3과목 점수 선언 jum[][] -> 2차원 배열 행 행(줄), 열(칸)
		int[][] jum = {{90,46,90},{67,98,100},{78,98,67},{78,98,88},{88,98,100}};
		int hap =0;
		float py = 0.0f;
		int [] tot;
		float[] avg;
		
		
		//정체총점(hap), 전체평균(py), 과목총점(tot), 과목평균(avg),
//			성명		국어		영어		수학
//			---		---		---		---
//			---		---		---		---
//		***********************************
//		    총점 		xx		xx		xx
//		    평균		xx.x	xx.x	xx.x
//		    전체총점 : xxx 	전체평균 : xx.x
		
		for(int i=0;i<names.length;i++) {
			for(int g=0; g<3; g++) {
				tot[i]+=jum[i][g];
				hap+=jum[i][g];
			}
		}
		System.out.println("");
		for(float i =0.0f; i<names.length; i++) {
			for(float g=0.0f; g<3; g++) {
				hap+=jum[i][g];
				
			
				
			}
		}
	

						;
				
			
		}

	}


