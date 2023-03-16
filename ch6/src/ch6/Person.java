package ch6;

public class Person {

	String name;
	float height;
	float weight;

	void print() {
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
	}

	// name 매개변수에 값을 받아서
	// Person이 가지고 있는 name 인스턴스변수의 값을 변경
	// set을 할 때 주로 void 함
	public void setName(String name) {
		//name이 공백이 아니고 null아니면
		//공백이거나 null 이면 기본값을 홍길동
	if (name.equals("")|| name == null) {
		this.name ="홍길동";
	}else {
		this.name  = name;
	}
	
	}
	static void print2 () {
		Person p = new Person();
		p.setName("");
	}
		
}
