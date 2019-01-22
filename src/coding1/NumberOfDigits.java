package coding1;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int digit;
		while(a<=0) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("양의 정수를 입력하세요 : ");
			a = scanner.nextInt();
			scanner.close();
		}
		String aStr=Integer.toString(a);
		int lenght=aStr.length();
		digit=(int) Math.pow(10, lenght-1);
		System.out.println(digit+"자리수");
	}

}
