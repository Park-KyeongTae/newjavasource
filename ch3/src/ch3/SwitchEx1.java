package ch3;

public class SwitchEx1 {

	public static void main(String[] args) {
		{
			// if 보단 덜 쓰임
			// switch : if~else, if~else 대신 사용

//		int jumsu=60;
//		//지역변수는 무조건 초기화 후 사용
//		char grade=' ';// char : 문자 한개
//		if(jumsu>=90) {
//			grade='A';
//		}else if(jumsu>=80){
//			grade='B';
//		}else if(jumsu>=70){
//			grade='C';
//		}else if(jumsu>=60){
//			grade='D';
//		}else if(jumsu>=50){
//			grade='E';
//		}else { //0~49
//			grade='F';
//		}
//		
//	System.out.printf("점수 : %d, 등급 : %c\n",jumsu,grade);

			int month = 7;
			switch (month) {
			case 3: // month==3
			case 4:
			case 5:
				System.out.println("현재 계절은 봄");
				break;// 브레이크에 속해있는 블록에서 나온다
			case 6:
			case 7:
			case 8:
				System.out.println("현재 계절은 여름");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("현재 계절은 가을");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("현재 계절은 겨울");
				break;
			}
		}
	}
}