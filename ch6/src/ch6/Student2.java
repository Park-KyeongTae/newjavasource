package ch6;

public class Student2 {
	String name;  //학생이름 name ex)홍길동
	int ban; //반 ban ex)1
	int no; //번호 no ex)1
	int kor; //국어점수 kor ex)76
	int eng; //영어점수 eng ex)65
	int math; //수학점수 math ex)65
	
//	public Student2(String name, int ban, int no) {
//		super();
//		this.name = name;
//		this.ban = ban;
//		this.no = no;
//	}

	public Student2(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal(){
		return this.kor+this.eng+this.math;
	}
	double getAverage(){
		return getTotal()/3.0;
	}

	
	
	
	
//	 String info() {
//		 int sum = this.kor+this.eng+this.math;
//		 double avg = (double) sum / 3; 
//		return this.name+","+this.ban+","+this.no+","+this.kor+","+this.eng+","+this.math+","+sum+","+avg;
//	}
	
	
	
	
}
