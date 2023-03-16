package ch3;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		// +,-,*,/,%
		
		//사용자로부터 두개의 피연산자와 연산자를  입력받기
		//연산을 수행 후 출력
		
	 Scanner sc = new Scanner(System.in);
	 System.out.println("첫번째 입력");
	 int a = Integer.parseInt(sc.nextLine());
	 
	 System.out.println("연산자 입력");
	 String op = (sc.nextLine());
	 
	 System.out.println("두번째 입력 ");
	 int b = Integer.parseInt(sc.nextLine());
	 int result = 0;
	 switch (op) {
	case "+":
		 result =a+b;
		break;
	case "-":
		 result =a-b;
		break;
	case "*":
		 result =a*b;
		break;
	case "/":
		 result =a/b;
		break;
	default:
		 result =a%b;
		break;
	}
	 System.out.printf("%d %s %d = %d",a,op,b,result);
	}
}