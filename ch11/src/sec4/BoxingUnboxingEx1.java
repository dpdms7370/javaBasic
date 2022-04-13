package sec4;

public class BoxingUnboxingEx1 {

	public static void main(String[] args) {
		// Boxing : 기본(Primitive) -> 래퍼(Wrapper)
		//short -> Short
		//int -> Integer
		//long -> Long
		//float -> Float
		//double -> Double
		//byte -> Byte
		//boolean -> boolean
		//char -> Character
		//반대로는 언박싱
		
		
		int a = 171717;
		float g3 = 7.14f;
		
		Integer int1 = new Integer(1004);
		Integer int2 = new Integer("1004");
		Integer int3 = Integer.valueOf(a);
		Integer int4 = new Integer(a);
		
		Float fl1 = new Float(2.12);
		Float fl2 = new Float("2.12");
		Float fl3 = Float.valueOf("2.12");
		Float fl4 = Float.valueOf(g3);
		Float fl5 = new Float(g3);
		
		
		//언박싱

		int iv1 = int1.intValue();
		
		
		

	}

}
