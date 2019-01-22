package coding1;

public class CountingNumbers_1_1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []n = new int[10];
		for(int i =0; i<10; i++) {
			 n[i]=0;
		}	
		for(int i=1;i<=1000;i++) {
			String x = String.valueOf(i);
			for(int j=0;j<x.length() ;j++) {
				char y= x.charAt(j);
				int k= (int)y-48;
				n[k]+=1;
			}
		}
		for(int i=0; i<10; i++) {
			 System.out.println("n["+i+"] = "+n[i]);
		}	
	}

}
