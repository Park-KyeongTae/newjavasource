package ch6;

public class TvEx3 {

	public static void main(String[] args) {
		// 객체생성
		Tv3 tv = new Tv3();
		Tv3 tv2 = new Tv3("white",7,false);
	
		// 초기화 ==> 직접 접근 불가 (privite)떄문
		// 1.생성자
		// 2. 멤버 변수의 값 변경 위한 메소드 제공
		
		// 현재 채널 정보를 알고 싶다면?
		// (privite)떄문에 불가능 tv. 실행해야되는것들 안됨
		System.out.println("현재채널"+tv2.getChannel());
		System.out.println("현재컬러"+tv2.getColor());
		System.out.println("현재전원"+tv2.isPower());

		// tv2 채널 변경
		tv2.setChannel(150);
		System.out.println("현재 채널"+tv2.getChannel());
		//tv 속성 값 변경
		//색상 변경 
		//메소드 호출 시 void인 경우 호출만 가능
		//syso에 넣지 못함
		tv.setColor("black");
		System.out.println("tv color "+ tv.getColor());
		System.out.println("현재 전원 여부 "+ tv.isPower());
	
	}
	

}
