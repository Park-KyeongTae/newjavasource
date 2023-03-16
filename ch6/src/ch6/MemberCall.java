package ch6;
/* 변수와 메서드에 static이  붙으면 같은 static 끼리는 문제가 없음
 * static이 붙지 않은 변수나 메서드를 호출하면 인스턴스 생성 후 가능 ==> new
 * 
 */
public class MemberCall {
	// 인스턴스 변수
	int iv = 10;
	// static(클래스 변수) 변수
	static int cv = 20;
	// 상황 인스턴스 변수 = 클래스 변수
	int iv2 = cv;
	// 상황 클래스변수 = 인스턴스 변수
	//     인스턴스 변수 값 클래스 변수에 대입 불가
	// 생성 시기가 다르기 때문에 대입 불가 
	//	static int cv2 = iv;  ==> new 이후 가능
	
	static void staticMethod() {
		System.out.println(cv);
		//System.out.println(iv); ==> new 이후 가능
		//instanceMethod1(); ==> new 이후 가능
	}
	
	void instanceMethod() {
		System.out.println(cv);
		//iv와 instanceMethod()생성되는 시기가 같음
		System.out.println(iv);
	}

}
