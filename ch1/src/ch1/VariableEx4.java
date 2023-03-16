package ch1;
//대입되는 값(상수)
//정수형 : long
public class VariableEx4 {

	public static void main(String[] args) {
	// 접미사 : l, f, d
	long big = 100_000_000_000L;
	float f = 0.14159f;
	double d = 0.141592d; // d는 필수가 아님
	
	// 접두사 : 0(8진수), 0x(16진수), 0b(2진수)
	int octnum = 010;//8진수 10==> 10진수로 출력
	int hexnum = 0x10;//16진수 10
	int binnum = 0b10;//2진수 10
	System.out.println(octnum);
	System.out.println(hexnum);
	System.out.println(binnum);
	
	// 타입이 달라도 저장범위가 넓은 타입에 좁은 타입의 값을 저장하는 것은 허용됨
	// 'A' : 2BYTE
	// INT : 4BYTE
	int i ='A';
	System.out.println(i);
	
	//byte b = 128;
	//** : 문자열
	// String : 참조타입
	String name = "hong";
	//① name 값 가져오기
	//② 문자 77을 가져오기
	//④ 연결한 값을 name 담기
	name = name + "77"; 
	System.out.println(name);
	
	String num = 7+7+"7";
	System.out.println(num);
	
	//printf() : 형식화된 출력
	//%d : 10진 정수의 형식 출력
	//%c : 문자
	//%s : 문자열
	//%f : 부동소수점
	int age = 25;
	System.out.println("age="+age);
	System.out.printf("age=%d\n",age); //10은 열칸뛰고 
	
	char ch1='a';
	String str1 = "abcd";
	double d1 = 3.141592;
	System.out.printf("ch1=%c\n",ch1); //\n 띄어쓰기
	System.out.printf("str1=%s\n",str1);
	System.out.printf("%s\n",str1);// 음수 왼쪽정렬
	System.out.printf("%s\n",str1);// 양수 오른쪽정렬
	System.out.printf("d1=%.3f\n",d1); //.3은 소수점3자리
	
	
	}
}
