package coding1;
import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자열을 입력 하시오");
		Scanner scan1 = new Scanner(System.in);
		String x = scan1.next();
		System.out.println("n의 값을 입력 하시오");
		Scanner scan2 = new Scanner(System.in);
		int n = scan2.nextInt();
		boolean k=true;
		
		String y="";
		
		/*for(int i=0;i<x.length();i++) {
			y+=(char)(x.charAt(i)+n);
		}*/
		
		for(int i=0; i<x.length();i++) {
			char a = x.charAt(i);
			if((a>='A')&&(a<='Z')) {
				while((int)a+n>90) {
					a-=26;
				}
				y+=(char)(a+n);
			}
			else if((a>='a')&&(a<='z')) {
				while((int)a+n>122) {
					a-=26;
				}
				y+=(char)(a+n);
			}
			else {
				k=false;
			}
				
		}
		if(k)
			System.out.println("암호문 : "+y);
		else
			System.out.println("잘못된 암호 입니다.");
		
	}

}
