package ch5;

import java.util.Arrays;

public class ArrayEx5 {

	public static void main(String[] args) {
		int[] numArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(numArr));
		
		
		
		
		for (int i = 0; i < 100; i++) {
			// 0~9 사이의 임의의 값 구하기
			int n = (int) (Math.random() * 10);
			
			// 구한 자리와 0 요소랑 값을 교환하기
			int temp = numArr[0]; //temp = 0
			numArr[0] = numArr[n]; //numArr[0]=랜덤
			numArr[n] = temp;//n
		}System.out.println(Arrays.toString(numArr));
	}
}