package coding1;

import java.util.Scanner;

public class NoticeBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		System.out.print("�� �Խù��� ���� �Է��ϼ��� : ");
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		while(n<1) {
			System.out.print("�� �������� ������ �Խù��� ���� �Է��ϼ��� : ");
			n = scanner.nextInt();
		}
			
		int page;
		
		if(m==0) 
			page=0;
		
		else if(m%n==0)
			page = m/n;
		else
			page = m/n+1;
		
		System.out.println("�� �������� ���� "+page+" �̴�.");
	}

}
