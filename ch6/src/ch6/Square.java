package ch6;

public class Square {
	//정사각형 넓이
	//속성
	//변
	int length;
	
	//매개변수가 있는 생성자 만듬
	public Square(int length) {
		super();
		this.length = length;
	}

//기능
	//넓이 구하기
int getArea() {
	return length*length;
}
}
