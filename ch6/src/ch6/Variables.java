package ch6;
//선언위치에 따른 변수와 종류가 다름
//생성시기
//클래스 변수: 클래스가 메모리에 올라갔을 때(저장했을 때 제일 먼저 올라감)
//인스턴스 변수: 인스턴스가 생성되었을 때(객체를 생성했을 때)
//지역변수 : 변수 선언문이 수행되었을 때
public class Variables {
	int num; 		//멤버변수(인스턴스 변수)
	static int cv; 	//클래스 변수(static 변수,공유 변수)
	
	void method(String name/*지역변수*/) {
		int lv=0; 	//지역변수
	}
}
