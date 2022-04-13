package sec1;

public class Car {
	String name;
	String style;
	String company;
	int fuel;
	int tire;
	int speed;
	int num;
	String usetime;
	
	Car() {this("K5");}
	Car(String name){this(name,"승용차");}
	Car(String name,String style){this(name, style,"페라리");}
	Car(String name,String style, String company){this(name,style,company,0);}
	Car(String name,String style, String company, String fuel){
		this(name,style,company,fule,4);
	}
	Car(String name,String style, String company, String fuel, int tire){
		this(name,style,company,fule,tire,0);
	}
	Car(String name,String style, String company, String fuel, int tire, int speed){
		this(name,style,company,fule,tire,speed);
	} 
	Car(String name,String style, String company, String fuel, int tire, int speed){
		this(name,style,company,fule,tire,speed);
		Car(String name,String style, String company, String fuel, int tire, int speed){
			this(name,style,company,fule,tire,speed);
	
	 {
		this.name = name;
		this style = style;
		this.company = company;
		this.fuel = fuel;
		this.tire = tire;
		this.speed = speed;
		this.num = num;
		this.usetime = usetime;}
	
	
	
	

}
