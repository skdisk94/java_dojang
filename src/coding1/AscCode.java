package coding1;

import java.util.Scanner;

public class AscCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("문자를 입력하여라 : ");
		Scanner scanner = new Scanner(System.in);
		char a = scanner.next().charAt(0);
		System.out.println(a+"는 아스키코드로 "+(int)a+" 입니다.");
	}

}
