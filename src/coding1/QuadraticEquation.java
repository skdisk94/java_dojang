package coding1;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("a�� ���� �Է� �Ͻÿ�");
		int a = scanner.nextInt();
		System.out.println("b�� ���� �Է� �Ͻÿ�");
		int b = scanner.nextInt();
		System.out.println("c�� ���� �Է� �Ͻÿ�");
		int c = scanner.nextInt();
		double x1,x2;
		
		double k = (double) (Math.pow(b,2)-4*a*c);
		
		if(k>0) {
			x1=(double) (-b+Math.sqrt(k))/2*a;
			x2=(double) (-b-Math.sqrt(k))/2*a;
			System.out.println(a+"x^2+"+b+"x+"+c+"�� �ش�"+x1+","+x2+"�̴�.");
		}
		else if(k==0) {//�߱�
			x1=(double) (-b+Math.sqrt(k))/2*a;
			System.out.println(a+"x^2+"+b+"x+"+c+"�� �ش�"+x1+"�̴�.");
		}
			
		else
			System.out.println("�ٽ� �Է��� �ּ���.");
	}

}
