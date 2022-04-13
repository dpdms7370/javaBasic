package Confirm6;


import java.util.Scanner;

public class BankApplication {
	
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계죄목록 | 3.예금 | 4.츨금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택>");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) { createAccount(); }
			else if (selectNo == 2) { accountList(); }
			else if (selectNo == 3) { deposit(); }
			else if ( selectNo == 4) { withdraw(); }
			else if ( selectNo == 5) {
				
				run = false;
			}
		}
			System.out.println("프로그램 종료");
	}
	//계좌생성하기
	private static void createAccount() {	
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액:");
		int balance = scanner.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		
		for(int i=0;i<=accountArray.length;i++) {
			if(accountArray[i]==null) {
			accountArray[i] = newAccount;
			System.out.println("결과: 계좌가 생성 되었습니다.");
			break;
			}		}	}
	
	
	private static void accountList() {
			
		System.out.println("-----------");
		System.out.println("계좌목록");
		System.out.println("-----------");
		
		for(int i=0;i<accountArray.length;i++) {
			
			Account account = accountArray[i];
			
			if(account != null) {
			
			System.out.print(account.getAno());
			System.out.print("\t");
			System.out.print(account.getOwner());
			System.out.print("\t");
			System.out.print(account.getBalance());
			System.out.println("\t"); }
		
		}
		
		
		
	}
	
	
	private static void deposit() { 
		
		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		System.out.print("계좌번호 :");
		String ano = scanner.next();
		System.out.print("예금액 :");
		int money = scanner.nextInt();
	
		Account account = findAccount(ano); 
		
		if(account==null) {System.out.println("계죄기 존재하지 않습니다."); return;}
		account.setBalance(account.getBalance()+money);
		System.out.println("입금이 성공되었습니다.");
		
	
	}
	
	
	
	private static void withdraw() { 
		
		System.out.println("-----------");
		System.out.println("출금");
		System.out.println("-----------");
		
		System.out.print("계좌변호 : ");
		String ano = scanner.next();
		System.out.print("츨금액 : ");
		int money = scanner.nextInt();
		
		Account account = findAccount(ano);
		
		if(account==null) {System.out.println("계좌가 없습니다."); return;}
		account.setBalance(account.getBalance()-money);
		System.out.println("출금이 성공되었습니다.");
		
		
		
	}
	
	
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0;i<=accountArray.length;i++) {
			if(accountArray[i] != null) {
				String dbaccount = accountArray[i].getAno(); //배열 속에서 계죄번호를 가져와 dbaccount에 저장하겠다.
				if(dbaccount.equals(ano)) { account = accountArray[i]; break;}
			}  
				
			} return account;
	}
	
	
	
	
	
}
