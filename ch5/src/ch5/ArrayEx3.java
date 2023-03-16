package ch5;

public class ArrayEx3 {

	public static void main(String[] args) {
	
		//int[] score= {100,88,100,100,90};
		//int score[]= {100,88,100,100,90};
		//[] : 1차원 배열
		//[][]:2차원 배열(행(가로),열(세로))
		int[] score= {100,88,100,100,90};
		
		//배열 총합과 평균
		int sum=0;
		float average=0f;
		
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];
		}
		// 478/5 ==> 95.0
		// 478/5.0 ==> 95.6
		average= sum / (float)score.length;
		
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+average);
		
	
	
	
	}
}