package ch6;

public class CalcEx2 {

	public static void main(String[] args) {
		Calc2 calc = new Calc2();
		
		

		System.out.println(calc.add(5,3));
		System.out.println(calc.add(5,3l));
		System.out.println(calc.add(5l,3));
		System.out.println(calc.add(5,3.0f));
		
		calc.add(5, 3);
		calc.add(5, 3l);
		calc.add(5l, 3);
		calc.add(3, 3.0f);
		int num[]= {100,200,300,400};
		calc.add(num);
		System.out.println(calc.add(num));
	}
}
