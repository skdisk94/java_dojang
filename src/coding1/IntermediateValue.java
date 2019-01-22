package coding1;

import java.util.Scanner;

public class IntermediateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("a의 값을 입력 하시오");
		int a = scanner.nextInt();
		System.out.println("b의 값을 입력 하시오");
		int b = scanner.nextInt();
		System.out.println("c의 값을 입력 하시오");
		int c = scanner.nextInt();
		
		
		System.out.println("중간 값은 "+middle(a,b,c));
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
