package sec2;

import org.omg.CORBA.PUBLIC_MEMBER;

public class SingletonEx1 { //공유 냉장고과 같은 개념, 모든 것을 다 공유하는 것.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		obj1.num =1004;
		if(obj1==obj2) {
			System.out.println("obj1 == obj2");
		} else {
			System.out.println("obj1 != obj2");
		}
		System.out.println(obj2.num);
		obj2.num =2008;
		System.out.println(obj2.num);
		

	}

}
