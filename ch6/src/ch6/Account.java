package ch6;

public class Account {
//속성
	//계좌번호(110-10-10000) accountNo
	//계좌주(홍길동) owner
	//잔액(정수) balance
	
	String accountNo;
	String owner;
	int balance;
	//기능
	//예금하다(deposit),인출하다(withdraw)
	
	public Account(String accountNo, String owner, int balance) {
		super();
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	//예금하다 : 현재 잔액 = 잔액 + 예금액, 현재 잔액 리턴
	int dsposit(int amount) {
		balance = balance + amount; // balance+=amount
		return balance;
	}
	
	//인출하다 : 잔액 > 출금액, 현재 잔액 = 잔액 - 출금액, 현재 잔액 리턴
	int withdraw(int amount) {
		if(balance > amount) {
			balance-= amount;
		}
		return balance;
		
	}
}
