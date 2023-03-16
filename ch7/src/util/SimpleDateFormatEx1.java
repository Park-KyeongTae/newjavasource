package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 형식화 클래스
 * java.text 패키지
 * 
 */
public class SimpleDateFormatEx1 {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);

		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(date));

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss ");
		System.out.println(sdf2.format(date));
		// y는 연도, M는 월, d는 일, h는 시간, m은 분, s는 초, H는 24시간 기준 시, a는 오전/오후

		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년MM월dd일");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy/MM/dd");
		
		// 예외 exception - 컴파일 예외
		try {
			//parse() 날짜 데이터의 출력 형식을 변환
			Date d = sdf3.parse("2023년 03월 09일");
			System.out.println(sdf4.format(d));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
