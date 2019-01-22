package coding1;
import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자연수를 입력하시오");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum=0;
		System.out.println(n+"이하의 완전수는 ");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum+=j;
				}
			}
			if(i==sum) {
				System.out.println(i);
			}
			sum=0;
		}
	}

}
