package coding1;

import java.util.Scanner;

public class TheKnightsOfTheRoundTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
		int c=0;
		double r;
		boolean k = true;
		while(k) {
			System.out.print("a : ");
			Scanner scanner = new Scanner(System.in);
			a = scanner.nextInt();
			System.out.print("b : ");
			b = scanner.nextInt();
			System.out.print("c : ");
			c = scanner.nextInt();
			if((a<1000000 && a>0 && b<1000000 && b>0 && c<1000000 && c>0)&& max(a,b,c)<=((a+b+c)/2))
				k=false;
			else
				System.out.println("다시 입력 하세요.");
			
		}
		int sum=a+b+c;
		r=(double)triangleWidth(a,b,c)*2/sum;
		System.out.println("반지름의 길이는 "+(double)Math.round(r*1000)/1000+"이다.");

	}

	public static int max(int a, int b, int c) {
		// TODO Auto-generated method stub
		int max=a;
		if(max<b)
			max=b;
		if(max<c)
			max=c;
		return max;
	}
	
	public static double triangleWidth(int a, int b, int c) {
		// TODO Auto-generated method stub
		double s = (double)(a+b+c)/2;
		return (double) Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

}
