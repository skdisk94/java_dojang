package coding1;

import java.util.Scanner;

public class IntermediateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("a�� ���� �Է� �Ͻÿ�");
		int a = scanner.nextInt();
		System.out.println("b�� ���� �Է� �Ͻÿ�");
		int b = scanner.nextInt();
		System.out.println("c�� ���� �Է� �Ͻÿ�");
		int c = scanner.nextInt();
		
		
		System.out.println("�߰� ���� "+middle(a,b,c));
	}
	public static int middle(int a, int b, int c) {
		int middle = 0;
		
		if((a>b&&b>c)||(a<b&&b<c))
			middle = b;
		else if((a>c&&c>b)||(a<c&&c<b))
			middle =c;
		else
			middle=a;
			
		return middle;
	}
}
