package ch4;

import java.util.Iterator;

/* 중첩 for
 * for문 안에 for문 포함
 * 
 */
public class ForEx4 {

	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {
			System.out.println("**********");

		}
		System.out.println();
		// 바깥 for int i =1
		// i < 6
		// 안쪽 for
		// j < 10;
		// System.out.print("*");
		// j++ j=1
		// j < 10;
		// System.out.print("*");
		// 6~8번 반복됨
		// j가 10이 되면 안쪽 for 거짓이 됨==> 안쪽 for 종료
		// System.out.println();
		// 바깥쪽 for i++ i=2
		// i < 6 조건 비교
		// 안쪽 for 문 10번 수행
		// 계속반복되다가 i가 6이 되는 순간 바깥for 종료
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// *
		// **
		// ***
		// ****
		// *****
		System.out.println();
		for (int i = 1; i <= 1; i++) {
			System.out.print("*");

		}
		for (int i = 1; i <= 2; i++) {
			System.out.print("*");

		}
		for (int i = 1; i <= 3; i++) {
			System.out.print("*");

		}
		for (int i = 1; i <= 4; i++) {
			System.out.print("*");

		}
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		// 이중 for 문
		
		
		System.out.println();
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
		System.out.println();
		//4x5y=60모든해구하기
		//단 x,y는 10이하 자연수
		//4*1+5*1=60
		//60이 나오는 x,y출력
		
		for (int i = 1; i <=10; i++) {
			for (int j = 1; j <= 10; j++) {
			 if(4*i+5*j==60){
				 System.out.printf("(%d,%d)\n",i,j);
			 }
			}
			
		}
		//break;
		//자신이 포함된 가장 가까운 반복문 벗어나게 됨
		//if와 주로 같이 사용
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i==5) break;
		}
		
		System.out.println();
		//continue;
		//반복문 내에서만 사용
		//반복이 진행되는 도중에 continue 문을 만나면 반복문의 끝으로 이동하여 다음
		//반복으로 넘어감
		
		for (int i = 0; i <= 10; i++) {
			
			if(i%3==0) continue;
			System.out.println(i);
		}
		
		
		
		
		
		
	}
}
