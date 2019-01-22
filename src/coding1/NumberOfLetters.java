package coding1;

import java.util.Scanner;

public class NumberOfLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("문장을 입력하시오 :");
		String str = scanner.nextLine();
		String text1="";
		String text2="";
		
		text1=str.replace(" ", "");//띄어쓰기 제거
		text2=text1.replace("/n", "");//줄바꿈 제거
		
		int numberOfLetters= text2.length();
		
		System.out.println(numberOfLetters);
	}

}
