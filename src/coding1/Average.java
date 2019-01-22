package coding1;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {55,44,33,55,22,4,56};
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		avg=(double)sum/num.length;
		
		System.out.println("ЦђБе : "+avg);
	}

}
