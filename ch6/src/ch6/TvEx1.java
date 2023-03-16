package ch6;

public class TvEx1 {

	public static void main(String[] args) {
		// 클래스로부터 객체를 만드는 과정 : 인스턴스화
		// Tv 객체 생성
		// 클래스이름 변수명 = new 클래스이름
		//Tv tv = new Tv();
		
		//클래스 선언
		Tv tv; 
		//객체 생성
		tv= new Tv();
		
		//객체가 가지고 있는 속성, 메소드를 사용하기 위해서는 .(dot) 접근
		print(tv);//주소
		
		//멤버변수 초기화
		tv.color = "black";
		tv.channel =6;
		tv.power = true;
		
		//초기화 후 확인
		print(tv);
		
		//메소드 호출 ==> 메소드 실행(한번)
		tv.channelUp();
		System.out.println("채널"+tv.channel);
		tv.power();
		System.out.println("전원여부"+tv.power);
		
		//객체생성
		Tv tv2 = new Tv();
		tv2.color="white";
		tv2.channel=11;
		
		//tv켜기,tv끄기
		tv2.power();
		print(tv2);
		
	}
	//기본형 소문자 int,fioat,double
	//기본형 소문자 Date,String,배열int{}
	//기본형 매개변수 ==> 값만 복사
	//참조형 매개변수 ==> 주소가 복사
	
	static void print(Tv tv) {
		System.out.println("색상"+tv.color);
		System.out.println("채널"+tv.channel);
		System.out.println("전원여부"+tv.power);
	}
}
