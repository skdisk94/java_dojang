package coding1;

import java.util.Scanner;

public class NumberOfLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ� :");
		String str = scanner.nextLine();
		String text1="";
		String text2="";
		
		text1=str.replace(" ", "");//���� ����
		text2=text1.replace("/n", "");//�ٹٲ� ����
		
		int numberOfLetters= text2.length();
		
		System.out.println(numberOfLetters);
	}

}
