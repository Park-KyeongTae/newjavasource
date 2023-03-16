package ch5;

import java.util.Arrays;

/* 기본타입-byte,char,short,int,long,float,double,boolean
 * 참조타입-String(클래스),배열,
 * 메모리안 stack에서 변수의 값을 가져오지만 배열에서는 heap이란 장소에 저장되어있는 주소를 가져올 수 있다.
 */
public class ArrayEx2 {

	public static void main(String[] args) {
		int score[] = new int[5];

		for (int i = 0; i < score.length; i++) {
			score[i] = i * 10;
		}
		
		System.out.println(score);//메모리 주소가 나온다.
		System.out.println(Arrays.toString(score));
		System.out.println();
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}

		// 향상된 for문
		System.out.println();
		for (int i : score) {
			System.out.println(i);

		}
		int iArr2[]=new int[10];
		//1~10임의숫자를 생성해서 배열에 저장
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10)+1;
		}
		//출력
		System.out.println(Arrays.toString(iArr2));
		
				
		char caArr[]= {'b','c','d','f','a'};
		System.out.println(caArr);		
		
		String strArr[]= {"abc","efg"};
		System.out.println(strArr);
	}
}