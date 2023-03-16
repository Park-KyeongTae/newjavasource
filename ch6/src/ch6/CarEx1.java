package ch6;

public class CarEx1 {

	public static void main(String[] args) {
		// Car 객체 생성
		Car /*클래스이름(붕어빵틀)*/ car = new Car();/*객체(붕어빵반죽)*/

		// 초기화 (붕어빵속을 결정 팥,슈크림 등) 하지만 이 방식은 권장하지않음
		car.company = "현대";
		car.model = "아반떼";
		car.color = "black";
		car.maxspeed = 200;
		
		//메소드 호출
		car.forward();
		System.out.println("제조사"+car.company);
		System.out.println("모델"+car.model);
		System.out.println("색상"+car.color);
		System.out.println("최대속도"+car.maxspeed);
		
	}

}
