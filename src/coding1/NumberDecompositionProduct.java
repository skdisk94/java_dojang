package coding1;

public class NumberDecompositionProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []n = new int[1001];
		int sum=0;
		for(int i =10; i<=1000; i++) {
			 n[i]=1;
		}	
		for(int i=10;i<=1000;i++) {
			String x = String.valueOf(i);
			for(int j=0;j<x.length() ;j++) {
				char y= x.charAt(j);
				int k= (int)y-48;
				n[i]*=k;
			}
		}
		for(int i=10; i<=1000; i++) {
			 System.out.println("n["+i+"] = "+n[i]);
			 sum+=n[i];
		}
		System.out.println("sum = "+sum);
	}

}
