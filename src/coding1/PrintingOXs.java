package coding1;

import java.util.Scanner;

public class PrintingOXs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("정수를 입력하시오 : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		char [][] printingOXsArray=new char[num][num];
		for(int i=0;i<printingOXsArray.length;i++) {
			for(int j=0;j<printingOXsArray.length-(i+1);j++) {
				printingOXsArray[i][j]='O';
				System.out.print(printingOXsArray[i][j]+" ");
			}
			for(int k=printingOXsArray.length-(i+1);k<printingOXsArray.length;k++) {
				printingOXsArray[i][k]='X';
				System.out.print(printingOXsArray[i][k]+" ");
			}
			System.out.println();
		}
	}

}
