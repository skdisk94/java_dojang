package coding1;

import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		while(a<=0) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("���� ������ �Է��ϼ��� : ");
			a = scanner.nextInt();
		}
		String aStr=Integer.toString(a);
		int lenght=aStr.length();
		System.out.println(lenght+"�ڸ���");
	}

}
