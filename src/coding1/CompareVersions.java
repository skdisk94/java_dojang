package coding1;

import java.util.Scanner;

public class CompareVersions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("����1�� �Է��ϼ��� : ");
		Scanner scanner = new Scanner(System.in);
		String version1 = scanner.nextLine();
		System.out.print("����2�� �Է��ϼ��� : ");
		String version2 = scanner.nextLine();
		
		String version1Array[] = version1.split("\\.");
		String version2Array[] = version2.split("\\.");
		
		
		for(int i=0;i<version1Array.length;i++) {
			if(version1Array[i].charAt(0)=='0') 
				version1Array[i]=version1Array[i].substring(1);
			if(version2Array[i].charAt(0)=='0') 
				version2Array[i]=version2Array[i].substring(1);
			int a= Integer.parseInt(version1Array[i]);
			int b= Integer.parseInt(version2Array[i]);
			if(a!=b) { 
				if(a>b)
					System.out.println(version1+">"+version2);
				else
					System.out.println(version1+"<"+version2);
				break;
			}
			
		}
		
	}

}
