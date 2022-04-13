package sec3;

public class Accuont {
	private int balance;
	
	public Account() { }

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void deposit(int money) {
		balance+=money;
	}
	public void wutdraw(int money) throws BlanceUnderflowException {
		if(balance<money) {
			throw new BlanceUnderflowException("잔고 부족 : "+(money-balance)+"부족");
		}
		balance-=money;
	}

}

//throws- 메소드 옆, throw- 메소드 안!!