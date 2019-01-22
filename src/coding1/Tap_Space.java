package coding1;

import java.util.Scanner;

public class Tap_Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자열을 입력하시오");
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2="";
		
		str2=str1.replace("\t","    ");
		
		System.out.println("Tap -> Space후 문자열"+str2);
	}

}
