package coding1;

public class EvenFibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int n=0;
		
		while(f(n)<=4000000) {
			if(f(n)%2==0)
				sum+=f(n);
			n++;
		}
		System.out.println("400만 이하의 짝수인 피보나치 수열의 합은 "+sum);
	}
	public static int f(int a) {
		if(a==0)
			return 0;
		else if(a==1)
			return 1;
		else if(a==2)
			return 1;
		else
			return f(a-1)+f(a-2);
	}
}
