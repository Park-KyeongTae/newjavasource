package ch6;
/* 자바로 무엇을 만드려면 무조건 클래스로 만든다. 
 * 클래스안에
 */
public class Car {
	//속성(property):멤버변수
	//변수명은 소문자, 두개단어가 합쳐질땐 뒷단어앞대문자로
	//제조사,모델,색상,최대속도...
	String company;
	String model;
	String color;
	int maxspeed;
	
	
	
	//기능(function):메소드
	//전진한다,후진한다
	void forward() {
		System.out.println("전진한다.");
	}
	void backward() {
		System.out.println("후진한다.");
	}
	
	
}
