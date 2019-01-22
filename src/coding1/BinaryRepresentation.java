package coding1;

import java.util.Scanner;

public class BinaryRepresentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("2진법으로 변경할 숫자를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int remainder=0;
		int num=number;
		int x=1;
		while(number/Math.pow(2, x)>=1) {
			x++;
		}
		int numArray[]=new int[x];
		int k=0;
		
		while(num!=1) {
			remainder=num%2;
			num/=2;
			numArray[k]=remainder;
			k++;
		}
		numArray[k]=1;
		
		for(int i=k;i>=0;i--) 
			System.out.print(numArray[i]);
		System.out.print("(2)");
	}

}
