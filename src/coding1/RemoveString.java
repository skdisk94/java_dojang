package coding1;

import java.util.Scanner;

public class RemoveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ڿ��� �Է��Ͻÿ�.");
		Scanner sanner =new Scanner(System.in);
		String str = sanner.nextLine();
		
		String numberStr ="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=48 && str.charAt(i)<=57)
				numberStr +=str.charAt(i);
		}
		System.out.println("����� ���ڿ��� "+numberStr);
		sanner.close();
	}

}
