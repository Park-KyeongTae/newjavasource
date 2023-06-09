package network;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Iterator;

/*
 * 네트워킹
 * 두 대 이상의 컴퓨터를 케이블로 연결하여 네크워크 구성하는 것
 * 
 * 네트워크 어플리케이션 프로그램 작성 시 java.net 패키지를 사용함
 * 
 * 서버랑 클라이언트
 * 서버 : 서비스를 제공하는 컴퓨터(메일서버, 파일서버, 어플리케이션 서버 ...., 웹서버)
 * 클라이언트 : 서비스를 사용하는 컴퓨터(
 * 
 * IP주소 : 호스트를 구별하는 데 사용되는 고유한 값 
 *
 */
public class InetAddressEx2 {

	public static void main(String[] args) {
		// InetAddress 클래스 : IP 주소를 다루기 위한 클래스
		InetAddress ip = null;

		try {
			// getByName(호스트명) : IP주소를 얻게 됨
			ip = InetAddress.getLocalHost();
			// gethostName() : IP를 통해서 호스트명을 얻게 됨
			System.out.println("gethostName() :" + ip.getHostName());
			// gethostAddress() : ip 주소
			System.out.println("gethostAddress() :" + ip.getHostAddress());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
