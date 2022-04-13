package sec1;
class Student{
	int num;
	String name;
}

public class ArrayIndexOurofBoundsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] s = new Student[100];
		try { 
			System.out.println(s[100].num);
			System.out.println(s[100].name);
		} catch (ArrayIndexOutofBounds exception e) {
			System.out.println("값이 존재하지 않아");
		} 

	}

}
