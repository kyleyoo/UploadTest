import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {

		//1.���ڿ��� �Է�tz
		//2.������ Ÿ���� ��ȯ�Ѵ� String->char[] : ? -> ���۰������� �˻����Ѵ�. convert String to char[] ���۸� ���� �ؾߵȴ�.
		//3.������ �Ѵ�. : Arrays.sort 
		//4.���Ѵ�. : ArraysŬ������ equals�� ����
		
		Scanner in = new Scanner(System.in);
		
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		
		char[] mno1= str1.toCharArray();
		char[] mno2 = str2.toCharArray();
		
		Arrays.sort(mno1);
		Arrays.sort(mno2);
		
		if(Arrays.equals(mno1, mno2)){
			System.out.println("����");
		}else{
			System.out.println("�ٸ�");
		}
		

	}
}