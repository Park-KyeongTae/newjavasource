package exam;
/* 
 * 패키지 : 관련된 클래스, 인터페이스, 추상클래스 모아둔 것
 * import : 다른 패키지에 있는 거 불러올 때 사용
 * 클래스 작성
 */
public abstract class Calc {
	int a,b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	abstract int calculate();
}
