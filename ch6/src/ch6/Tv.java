package ch6;
//변수 ,연산자, 조건문, 반복문, 배열

//객체지향언어-자바
//코드의 재사용성 높다
//코드관리가 용이
//신뢰성 높은 프로그래밍 가능하게 함
//자바는 무조건 클래스를 만들어야함
//클래스 : 객체를 정의해 놓은 것
//클래스의 용도 : 객체를 생성하는데 사용
//객체 : 실제로 존재하는 것, 사물 or 개념
//메인변수가 없으면 런실행이 안됨
public class Tv {
// 속성(property) ==> 멤버변수
// 크기,길이,높이,색상,볼륨,채널......
	String color; // 색상
	int channel; // 채널
	boolean power; // 전원상태
// 기능(function) ==> 메서드
// 켜기,볼륨 높이기,끄기,볼륨 낮추기,채널변경......
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}
