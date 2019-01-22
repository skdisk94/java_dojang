package coding1;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<24;i++) {
			for(int j=0;j<60;j++) {
				if(i%10==3 || j%10==3 || (j>=30&&j<=39))
					sum+=60;
			}
		}
		System.out.println(sum);
	}

}
