package ch6;

public class MemberEx {

	public static void main(String[] args) {
		Member member1 = new Member("hong123","hong123@!","hong123@!","01012341234");
		Member member2 = new Member("hong123","hong123@!","hong123@!","01012341234","서울 종로구");
		
		if(member1.passwordAndCorfirmPasswordEquals()){
			//true 라면 비밀번호가 일치합니다.
			System.out.println("비밀번호가 일치합니다.");
		}else {
			//flase 라면 비밀번호를 확인해주세요.
			System.out.println("비밀번호를 확인해주세요.");
		}
		System.out.println(member2.passwordAndCorfirmPasswordEquals()?"비밀번호가 일치합니다.":"비밀번호를 확인해 주세요!");
				
				
		memberInfo(member1); //member1과 member2 내용 출력하기
		memberInfo(member2); //member1과 member2 내용 출력하기
	}
	
	static void memberInfo(Member member) {
			//출력결과
			//아이디 : 초기값 출력
			//비밀번호 : 초기값 출력
			//전화번호 : 초기값 출력
			//주소 : 초기값 출력
		System.out.println("아이디 :"+member.userid);
		System.out.println("패스워드 :"+member.password);
		System.out.println("전화번호 :"+member.hp);
		System.out.println("주소 :"+member.address);
		}
	
	
	

}
