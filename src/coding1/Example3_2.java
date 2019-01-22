package coding1;

public class Example3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int n = 10000;
		int length = (int)(Math.log10(n)+1);
		int a;
		
		/*for(int i=1;i<=n;i++) {
			if(i%10==8)
				count++;
			a = i/10;
			if(a%10==8)
				count++;
			int b = a/10;
			if(b%10==8)
				count++;
			int c = b/10;
			if(c%10==8)
				count++;
			int d = c/10;
			if(d%10==8)
				count++;
			
		}*/
		
		for(int i=1;i<=n;i++) {
			a=i;
			for(int j=1;j<length;j++) {
				if(a%10==8)
					count++;
				a/=10;
			}
		}
		
		System.out.println(count);
	}

}
