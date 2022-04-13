package digdo;

public class SoundableEx {
	
	
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
		
	}
	private static void main(String [] args) {
		printSound(new Cat());
		printSound(new Dog());
		// TODO Auto-generated method stub

	}

}
