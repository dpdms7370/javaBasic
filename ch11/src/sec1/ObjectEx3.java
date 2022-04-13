package sec1;

import java.util.HashMap;

class Key {
	public int number;
	public String value;
	Key(int number){ this.number = number;}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number )
				{return true;}
		}return false;
	
	}
	@Override
	public int hashCode() {
		return number;}
	@Override
	public String toString() {

		return number+" : "+value;
	}
	

	
}

public class ObjectEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Key, String> hash1 = new HashMap<>(); //키 값
		hash1.put(new Key(200), "김예은");
		
		String value = hash1.get(new Key(200));
		System.out.println(value);
		Key k = new Key(100);
		k.value = "송강";
		System.out.println(k.toString());

	}

}
// tostring은 자신이 출력 형태를 구미고 싶을 떄 쓴다.