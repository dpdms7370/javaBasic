package sec2;

public class ArithMatic3 {

	public static void main(String[] args) {
		//Not a number = NAN 검사
		String indata = "NaN";
		String data1 = "500.4";
		double val = Double.valueOf(indata);
		double data2 = 500.4;
		data2 +=val;		//data2=500.4+NaN
		System.out.println("출력 결과 : "+data2);
		
		data2 = 500.4;
		double val2 = Double.valueOf(data1); // "500.4" -> 500.4 -> 따옴표를 떼면 숫자가 될 수 있다.
		data2 += val2;
		System.out.println("출력 결과 : " +data2);
		
		

	}

}
