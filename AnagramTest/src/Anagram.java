import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {

		//1.문자열을 입력tz
		//2.데이터 타입을 변환한다 String->char[] : ? -> 구글같은데에 검색을한다. convert String to char[] 구글링 자주 해야된다.
		//3.정렬을 한다. : Arrays.sort 
		//4.비교한다. : Arrays클래스의 equals를 쓰고
		
		Scanner in = new Scanner(System.in);
		
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		
		char[] mno1= str1.toCharArray();
		char[] mno2 = str2.toCharArray();
		
		Arrays.sort(mno1);
		Arrays.sort(mno2);
		
		if(Arrays.equals(mno1, mno2)){
			System.out.println("같음");
		}else{
			System.out.println("다름");
		}
		

	}
}