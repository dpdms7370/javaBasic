package sec4;

import java.util.Arrays;
import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
//		Random.nextInt(종료값)+시작값
//		Random.nextDouble() : 0~1의 실수 반환
//		Random.nextBoolean() : true 또는 false를 무작위로 반환
//		
		Random random = new Random(5); // 몇번 돌릴 것인가 
		int[] selNum = new int[7];
		for(int i=0;i<6;i++) {
			selNum[i] = random.nextInt(45)+1;
		}
		System.out.println();
		Arrays.sort(selNum); //.sort는 정렬(기본적으로 오름차순)
		for(int sel : selNum) {
			System.out.println(sel+"\t");
		}
		
	}

}
