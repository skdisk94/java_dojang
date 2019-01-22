package coding1;

import java.util.Scanner;

public class RemoveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자열을 입력하시오.");
		Scanner sanner =new Scanner(System.in);
		String str = sanner.nextLine();
		
		String numberStr ="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=48 && str.charAt(i)<=57)
				numberStr +=str.charAt(i);
		}
		System.out.println("변경된 문자열은 "+numberStr);
		sanner.close();
	}

}
