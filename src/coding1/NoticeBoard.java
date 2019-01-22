package coding1;

import java.util.Scanner;

public class NoticeBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		System.out.print("총 게시물의 수를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		while(n<1) {
			System.out.print("한 페이지에 보여줄 게시물의 수를 입력하세요 : ");
			n = scanner.nextInt();
		}
			
		int page;
		
		if(m==0) 
			page=0;
		
		else if(m%n==0)
			page = m/n;
		else
			page = m/n+1;
		
		System.out.println("총 페이지의 수는 "+page+" 이다.");
	}

}
