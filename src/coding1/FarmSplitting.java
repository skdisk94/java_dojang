package coding1;

import java.util.Scanner;

public class FarmSplitting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("가로의 길이를 입력하여라 : ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.print("세로의 길이를 입력하여라 : ");
		int b = scanner.nextInt();
		int n=0;
		
		int big=0;
		
		if(a>b)
			big=a;
		else
			big=b;
		
		for(int i=1;i<=big;i++) {
			if(a%i==0&&b%i==0)
				n=i;
		}
		int count = a*b/n/n;
		System.out.println(count);
	}

}
