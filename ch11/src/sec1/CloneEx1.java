package sec1;

class Car {
	public int num;
	public int speed;
	public String name;
	Csr(int num ){this.num = num;}
}


class Employee implements Cloneable {
	public int no;
	public String name;
	public Car car;
	
	public Employee(int no, String name, Car car) {
		
		this.no = no;
		this.name = name;
		this.car = car;		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException { //복제할 내용을 기술
		Employee cloned = (Employee) super.clone(); // 얕은복제 - no,name,car만 복제됨.
		cloned.car = new Car(this.car.name); //중첩 글래스 개념 , 깊은 복제- 객체의 필드를 별도로 복제해주어야함
		return super.cloned();
	}
	// 배열도 깊은 복제로 해야함,for 문으로 돌려서 허허허헣

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return no+":"+name;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(no+"인 사원의 퇴사처리합니다.");
		super.finalize();
	}
	
	
}
public class CloneEx1 {

	public static void main(String[] args) {
		Car car = new car(1234);
		Employee emp1 = new Employee(1,"포르쉐",car)
				System.out.println(emp1.toString());
		emp1 = null;
		//System.gc(); -> 모두 날려버리기
	
	}
}
