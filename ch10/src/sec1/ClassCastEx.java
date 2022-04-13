package sec1;
class Animal {
	String name;
}

public class ClassCastEx {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeType(dog);
}
	public static void changeType(Animal Animal) {
		try {
			Dog dog = (Dog) animal;
		}catch(ClassCastException e) {
			System.out.println("형변황 할 수 없음");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("알수없어");
			e.printStackTrace();
		}finally {
			System.out.println("종료다!!!!!!!!");
		}
	}
}
