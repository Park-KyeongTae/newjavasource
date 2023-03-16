package ch5;
/* 배열(array)
 * 같은 타입의 여러 변수를 하나의 묶음으로 다루는 방법
 * int score1=98, score2=88,.............;
 * 
 * ==>int score[]; 대괄호는 배열의 뜻, 배열 선언
 * ==> score = new int[30]; 배열 생성 
 */

public class ArrayEx1 {

	public static void main(String[] args) {
		// 연속된 공간에 int 값을 저장할 수 있는 30개의 방을 생성
		// index를 이용해서 접근을 할 수 있음
		// int 타입은 0으로 초기화 됨
		int score[]=new int[30];
		System.out.println(score[0]);//0~29 인덱스로 접근
		System.out.println(score[15]);//0~29 인덱스로 접근
		//새로운 값을 할당
		score[0]=98; score[1]=80;
		
		
		//배열선언 생성 초기화
		//10명에 대한 점수를 배열로 다루기
		int score2[] = {97,45,78,68,50,65,45,60,69,45};
		System.out.println("5번째 학생 점수"+score2[4]);
		
		
		double score3[]= {98.3,88.5,78.6,68.9,50.2,65.0,45.5,60,69.8,45};
//		System.out.println("첫번째 학생 점수+"+score3[0]);
//		System.out.println("두번째 학생 점수+"+score3[1]);
//		System.out.println("세번째 학생 점수+"+score3[2]);
//		System.out.println("네번째 학생 점수+"+score3[3]);
//		System.out.println("다번째 학생 점수+"+score3[4]);
//		System.out.println("여섯번째 학생 점수+"+score3[5]);
//		System.out.println("일곱번째 학생 점수+"+score3[6]);
//		System.out.println("여덟번째 학생 점수+"+score3[7]);
//		System.out.println("아홉번째 학생 점수+"+score3[8]);
//		System.out.println("열번번째 학생 점수+"+score3[9]);

		
		for (int i = 0; i < score3.length; i++) {
			System.out.println((i+1)+"번째 학생 점수"+score3[i]);
		}
		
		//char 5개를 담는 배열
		char caArr[]= {'b','c','d','f','a'};
		
		//byte,char,short,int,long,float,double,boolean==>배열타입가능
		String strArr[]= {"abc","efg"};
		System.out.println(strArr[1]);
}
}