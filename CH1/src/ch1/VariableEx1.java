package ch1;

public class VariableEx1 {

	public static void main(String[] args) {
		// 변수 : 메모리 공간(특정공간)
		// 타입+변수명 = 값; ==> int num = 1; 
		// 메모리에 어떤 값을 저장할 것인가? 에 따라 타입 결정
		// 문자 : 문자('가'- char ), 문자열("가나다라")
		// 숫자 : 정수- byte, short, int, long
		//       실수- float, double
		// 논리 : 참(true), 거짓 (false)
		// 자바 문장의 끝은 세미클론으로 마무리
		// 변수의 선언(int a;)과 초기화(a=10;)
		
		int a=10, b=5;
		
		System.out.println("a+b");
		//""사용했을 때 그대로 프린트됨
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
	}

}
