package ch6;

public class Member {
 //아이디 userid ex)hong123
	String userid;
	//비밀번호 password ex)hong123@!
	String password;
	//비밀번호확인 confirmPassword ex)hong123@!
	String confirmPassword;
	//전화번호 hp ex)01012341234
	String hp;
	//주소 address ex)서울
	String address;
	
	public Member (String userid, String password, String confirmPassword, String string) {
		super();
		this.userid = userid;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.hp = string;
	}
	public Member (String userid, String password, String confirmPassword, String hp, String address) {
		super();
		this.userid = userid;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.hp = hp;
		this.address = address;
	}
	

	boolean passwordAndCorfirmPasswordEquals() {
		return password.equals(confirmPassword);
		//문자열 비교 == 사용하면 안됨
		// equals()
	}
}
			
			


	
