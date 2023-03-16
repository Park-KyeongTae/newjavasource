package network;

import java.net.URI;
import java.net.URL;

/*
 * URL(Uniform Resource Locator)
 * https://www.oracle.com/kr/artificial-intelligence/
 * https://movie.naver.com/movie/bi/mi/basic.naver?code=212917
 * 
 * 프로토콜 : https (서버자원의 접근하기 위해 서버와 통신한 데 필요한 통신규약)
 * 호스트명 : www.naver.com,search.naver.com(서버 이름)
 * 경로명 : 접근하려는 자원이 저장된 서버상의 위치
 * 파일명 : Scanner.html 
 * 퀴리 : URL 에서 ? 이후의 부분
 * 
 */
public class UrlEx1 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://movie.naver.com/movie/bi/mi/basic.naver?code=212917");

			System.out.println("url.getAuthority() : " + url.getAuthority());
			System.out.println("url.getContent() :" + url.getContent());
			System.out.println("url.getDefaultPort() :" + url.getDefaultPort());
			System.out.println("url.getPort() :" + url.getPort());
			System.out.println("url.getFile() :" + url.getFile());
			System.out.println("url.getHost() :" + url.getHost());
			System.out.println("url.getPath() :" + url.getPath());
			System.out.println("url.getQuery() :" + url.getQuery());
			System.out.println("url.getUserInfo() :" + url.getUserInfo());
			// toExternalForm() : URL 문자열로 변환
			System.out.println("url.toExternalForm() :" + url.toExternalForm());
			// toURI() : URL =>URI
			// URI가 URL을 포함하는 관계
			System.out.println("url.toURI() :" + url.toURI());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
