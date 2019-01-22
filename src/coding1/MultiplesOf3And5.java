package coding1;

public class MultiplesOf3And5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<1000;i++) {// 3ÀÇ ¹è¼ö
			if(i%3==0||i%5==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
	}

}
