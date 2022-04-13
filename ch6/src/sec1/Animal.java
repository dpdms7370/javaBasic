package sec1;

public class Animal {
	
	private String name;
	private String type;
	private int legs;
	private int wings;
	private Boolean spine;
	private int speed;
	
	Animal() {
		this.name,"승용차"};
		

	Animal(String name, String type, int legs, int wings, Boolean spine, int speed) {
		this.name =name;
		this.type =type;
		this.legs = legs;
		this.wings = wings;
		this.spine =spine;
		this.speed =speed;}
	

	public void running() {
		System.out.println("동물이 달립니다.");
	}
	
	public String running(String name) {
		return name *this.type;
	}public void running() {
		System.out.println("%c가 달립니다.",name);
	}
	
	public String (String name,String speed) {
		return name*speed;
	} public void running() {
		System.out.println("%c가 %dkm 속도로 달립니다.",name,speed);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

	public Boolean getSpine() {
		return spine;
	}

	public void setSpine(Boolean spine) {
		this.spine = spine;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	

}
