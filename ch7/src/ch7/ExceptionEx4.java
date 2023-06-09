package ch7;

/* 컴파일에러 : 컴파일 시 발생하는 에러 (코드에 빨간줄)
 * 런타임에러 : 실행 시 발생하는 에러  (콘솔에 빨간코드)
 * 논리적에러 : 실행은 되지만, 의도와 다르게 동작하는 것 (찾기 제일 어려움)
 * 
 * 에러(error) : 코드에 의해서 수습될 수 없는 심각한 오류 (메모리 부족, 스택오버플로우)
 * 예외(exception) : 코드에 의해서 수습될 수 있는 미약한 오류
 * 
 * 
 * Exception
 * 1) Exception 클래스들 : 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
 * 2) RuntimeException 클래스들 : 프로그래머의 실수로 발생하는 예외
 *  - 배열 범위 벗어나기, NullPointException, ClassCastException...
 *  
 *  
 *  Exception 처리
 *  try - catch
 *  예외 던지기 
 *  
 *  
 *  
 */
public class ExceptionEx4 {

	public static void main(String[] args) {
		//참조형 초기화
		// null : 아직 값이 할당되지 않았음
		
		String data = null; // String date = "hello";
		Account account = null; // Account account = new account();
		int[] arr = null; // int arr[]= new int[5];
		
		// 참조변수의 값 출력
		System.out.println(data);
		System.out.println(account);
		System.out.println(arr);
		
		// 참조변수가 가리키고 있는 곳을 접근시 java.lang.NullPointerException
//		System.out.println(arr[0]);
//		if (data != null) {
//			System.out.println(data.length());
//		}
		
		
		
	}

}
