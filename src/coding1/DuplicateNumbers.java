package coding1;

import java.util.Scanner;

public class DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("0~9������ ���� �ѹ��� ��� �Ͽ����� ã���ϴ�.");
		System.out.println("���� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		String x = scan.next();
		
		int y;
		int []a = new int[10];
		for(int i =0; i<10; i++) {
			 a[i]=10;
		}
		
		
		if(x.length()!=10)
			System.out.println(false);
		else {
			for(int i=0;i<10;i++) {
				y=(int) x.charAt(i)-48;
				a[y]=y;
			}
			for(int i=0;i<10;i++) {
				if(a[i]==10) {
					System.out.println(false);
					return;
				}					
			}
			System.out.println(true);
			/*for(int i=0;i<x.length();i++) {
				a[i]=x.charAt(i);
			}
			for(int i=0;i<a.length;i++) {
				
			}*/
		}
	}

}
