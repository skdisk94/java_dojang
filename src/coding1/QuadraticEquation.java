package coding1;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("a의 값을 입력 하시오");
		int a = scanner.nextInt();
		System.out.println("b의 값을 입력 하시오");
		int b = scanner.nextInt();
		System.out.println("c의 값을 입력 하시오");
		int c = scanner.nextInt();
		double x1,x2;
		
		double k = (double) (Math.pow(b,2)-4*a*c);
		
		if(k>0) {
			x1=(double) (-b+Math.sqrt(k))/2*a;
			x2=(double) (-b-Math.sqrt(k))/2*a;
			System.out.println(a+"x^2+"+b+"x+"+c+"의 해는"+x1+","+x2+"이다.");
		}
		else if(k==0) {//중근
			x1=(double) (-b+Math.sqrt(k))/2*a;
			System.out.println(a+"x^2+"+b+"x+"+c+"의 해는"+x1+"이다.");
		}
			
		else
			System.out.println("다시 입력해 주세요.");
	}

}
