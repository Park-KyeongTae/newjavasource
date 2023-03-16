package ch4;

import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
		// 팩토리얼
		//4!=4*3*2*1
		// 입력받기
		//팩토리얼 구한 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("팩토리얼 입력해주세요!");
		int result = Integer.parseInt(sc.nextLine());
		int fact =1; //곱셈 결과를 저장할 변수
		for (int i = result; i >=1; i--) {
			fact = fact*i;//fact*=i;
		}System.out.printf("d%! = %d",result,fact);

	}
}
