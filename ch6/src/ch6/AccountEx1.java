package ch6;

public class AccountEx1 {

	public static void main(String[] args) {
		Account account1 = new Account("110*10*10000","홍길동",1000);
		Account account2 = new Account("110*10*10000","성춘향",200000);

		
		//홍길동 계좌 입/출금 기능 사용 ==> 메소드 호출
		//
	System.out.println(account1.owner);
	System.out.println("===========================");
	System.out.println("현재 잔액 : "+account1.dsposit(300000));
	System.out.println("현재 잔액 : "+account1.withdraw(120000));
	
	
	System.out.println(account2.owner);
	System.out.println("===========================");
	System.out.println("현재 잔액 : "+account2.dsposit(300000));
	System.out.println("현재 잔액 : "+account2.withdraw(120000));
	
	}

}
