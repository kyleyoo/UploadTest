import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class PatternMatching {
	
	//
	public static void main(String[] args) {
//		기존 학생들의 점수와 진학기록의 통계를 내고 경향을 분석하여
//		내 점수를 가지고 내가 문과를 가야될지 이과를 가야될지 판단해주는 프로그램을 
//		작성해라.
//
//		여기에서 조건이 주어짐.
//		데이터를 하나의 클래스로 설계해서 프로그램을 작성하시오. 
		//배열에 성적데이터(int) 를 넣는다.
		//통계(문과, 이과 점수)를 낸다 근데 어떻게??
		//그리고 내점수를 입력받고
		//데이터 매치
		
		Scanner in = new Scanner(System.in);

		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(100.0, 50.4, 10.0,"문"));
		studentList.add(new Student(70.0, 90.4, 15.3,"문"));
		studentList.add(new Student(90.0, 70.4, 18.0,"문"));
		studentList.add(new Student(78.0, 88.4, 45.0,"문"));
		studentList.add(new Student(99.0, 99.4, 62.0,"문"));
		studentList.add(new Student(10.0, 88.4, 78.0,"이"));
		studentList.add(new Student(15.0, 98.4, 88.0,"이"));
		studentList.add(new Student(20.0, 78.4, 99.0,"이"));
		studentList.add(new Student(2.0, 88.4, 67.0,"이"));
		studentList.add(new Student(18.0, 50.4, 10.0,"이"));

		
		
	}
	
}