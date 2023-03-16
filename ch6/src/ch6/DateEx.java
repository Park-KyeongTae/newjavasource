package ch6;

public class DateEx {

	public static void main(String[] args) {
		Date date = new Date();

		// 초기화
		date.x = 10;
		System.out.println("main() : x = " + date.x);
		System.out.println();
		
		//값만 넘어감
		charge(date.x);
		System.out.println("after change(date.x)");
		System.out.println("main() :  x = "+date.x);
		System.out.println();
		//주소가 넘어감
		charge2(date);
		System.out.println("after change2(date.x)");
		System.out.println("main() :  x = "+date.x);
		System.out.println();
	}
	
	//static 호출스택 입/출구가 같음
	//기본형 매개변수 : 값만 받게 됨
	//int x : x가 가지고있는 값만 넘김
	static void charge(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}

	//참조형 매개변수 : 값을 읽고 수정 가능
	static void charge2(Date d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
	
	
}
