package coding1;

import java.util.Scanner;

public class MemorySpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("입력 받을 정수의 개수를 입력하시오 : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum=0;
		double avg;
		
		System.out.println(num+"개의 수를 입력 하여라");
		
		for(int i=0; i<num;i++) {
			int essencei = scanner.nextInt();
			sum+=essencei;
		}
		avg = (double) sum/num;
		
		System.out.println("모든 수의 합은 "+sum);
		System.out.println("모든 수의 평균은 "+avg);
	}

}
