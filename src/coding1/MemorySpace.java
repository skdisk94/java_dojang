package coding1;

import java.util.Scanner;

public class MemorySpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�Է� ���� ������ ������ �Է��Ͻÿ� : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum=0;
		double avg;
		
		System.out.println(num+"���� ���� �Է� �Ͽ���");
		
		for(int i=0; i<num;i++) {
			int essencei = scanner.nextInt();
			sum+=essencei;
		}
		avg = (double) sum/num;
		
		System.out.println("��� ���� ���� "+sum);
		System.out.println("��� ���� ����� "+avg);
	}

}
