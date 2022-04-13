package sec3;

public class BlanceUnderflowException extends Exception { // 이건 선생님이 생각해서 만든 예외

		public BlanceUnderflowException () { }
		public BlanceUnderflowException (String message) {
			super(message);
		}
		
}
//사용자 예외 만들기 