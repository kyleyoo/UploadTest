
public class Student {


	private	Double kor ;
	private	Double eng ;
	private Double math;
	private String select;
	
	public Student(Double kor, Double eng, Double math, String select) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.select = select;
	}

	@Override
	public String toString() {
		return "Student [kor=" + kor + ", eng=" + eng + ", math=" + math + ", select=" + select + "]";
	}
	
	
	
}
