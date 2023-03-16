package ch6;

public class DateEx2 {

	public static void main(String[] args) {
		// 인스턴스를 생성한다
		// 참조형 타입 변수명 = new 참조형타입();
		Date d = new Date();
		d.x = 10;
		Date d2 = copy(d); // 주소
		System.out.println("d.x = "+d.x);
		System.out.println("d2.x = "+d2.x);
	}

	static Date copy(Date d) {
		Date temp = new Date();
		//
		temp.x = d.x;
		return temp;
	}
}
