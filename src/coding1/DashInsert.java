package coding1;
import java.util.Scanner;

public class DashInsert{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자로 구성된 문자열을 입력하세요");
		Scanner scan = new Scanner(System.in);
		String x = scan.next();
		String y = "";
		int a,b;
		
		for(int i=0;i<x.length()-1;i++) {
			a =(int) x.charAt(i)-48;
			b =(int) x.charAt(i+1)-48;
			if(a%2==1&& b%2==1) {
				y+= x.charAt(i)+"-";
			}
			else if(a%2==0&& b%2==0) {
				y+= x.charAt(i)+"*";
			}
			else
				y+=x.charAt(i);
		}
		y+=x.charAt(x.length()-1);
		System.out.println(y);
	}
}
