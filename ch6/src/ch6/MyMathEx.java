package ch6;

public class MyMathEx {
	public static void main(String[] args) {
		
		//Math.random();
		
		
		//static 메소드 호출
		//클래스명. 메소드명()
		System.out.println(MyMath.add(200l, 300l));
		System.out.println(MyMath.subtract(200l, 300l));
		System.out.println(MyMath.multiply(200l, 300l));
		System.out.println(MyMath.divide(200l, 300l));

		
		
		// 인스턴스 메소드 호출
		MyMath mymath = new MyMath();
		mymath.a = 200l;
		mymath.b = 100l;
		System.out.println(mymath.add());
		System.out.println(mymath.subtract());
		System.out.println(mymath.multiply());
		System.out.println(mymath.divide());
		
		
	}

}
