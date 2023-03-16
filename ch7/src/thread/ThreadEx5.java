package thread;

public class ThreadEx5 {

	public static void main(String[] args) {
		CalcThread t1 = new CalcThread();
		CalcThread2 t2 = new CalcThread2();
		
		// 우선순위 : 숫자가 높을 수록 우선순위 높음
		//          최대 우선 순위는 10까지
		//          Main 에서 생성된 쓰레드는 우선 순위가 5로 자동저장
		t2.setPriority(7);
		
		System.out.println("t1 우선순위"+ t1.getPriority());
		System.out.println("t2 우선순위"+ t2.getPriority());

		
		t1.start();
		t2.start();
	}

}
