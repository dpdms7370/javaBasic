package sec4;

import java.util.Arrays;

public class ArraysEx1 {

	public static void main(String[] args) {
		
		
		char[] arr1 = {'H','A','P','P','Y'};
		char[] arr2 = arr1;
		System.out.println("얕은 복제");
		System.out.println(arr1);
		System.out.println(arr2);
		
		//Array.arraycopy(배열객체명, 시작인덱스, 배열복제객체명, 복제객체의시작위치, 복사요소개수);
		
		System.out.println("깊은 복제");
		char[] arr3 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(arr3);
		char[] arr4 = Arrays.copyOfRange(arr3, 2, 3);
		System.out.println(arr4);
		System.out.println("얕은 복제의 비교1 : " + Arrays.equals(arr1, arr2));
		System.out.println("얕은 복제의 비교2 : " + Arrays.equals(arr1, arr4));
		
//		System.out.println("얕은 복제의 비교2: " +Arrays.deepEquals(arr1, arr2));
//		System.out.println("얕은 복제의 비교2: " +Arrays.deepEquals(arr1, arr3));
//		// -> 2차원 배열일 경우에
		
		System.out.println("arr1의 주소 : "+Arrays.hashCode(arr1));
		System.out.println("arr2의 주소 : "+Arrays.hashCode(arr2));
		System.out.println("arr4의 주소 : "+Arrays.hashCode(arr4));
		
		String [] arr5 = {"자장면","짱뽕","탕수육","양장피",""};
		Arrays.sort(arr5);
		System.out.println("정렬 후");
		for(String name : arr5) {
			System.out.println(name);
		}
		System.out.println("정보검색 : 몇번째인가?");
		String data = "짬뽕";
		int food = Arrays.binarySearch(arr5, data);
		System.out.println("잠뽕의 인덱스 : "+ food);
		
		
		

	}

}
