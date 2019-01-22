package coding1;

public class FindingTheMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {55,44,33,55,22,4};
		int temp;
		double avg=0;
		
		for(int i=0;i<num.length;i++) {
			for(int k=0;k<num.length-i-1;k++) {
				if(num[k]>num[k+1]) {
				temp = num[k];
				num[k]=num[k+1];
				num[k+1]=temp;
				}
			}
		}
		
		if(num.length%2==1) {//홀수개 있을 때
			avg=(double)num[num.length/2];
		}
		else{//짝수개 있을 때
			avg=(double)(num[num.length/2]+num[num.length/2-1])/2;
		}
		System.out.println("중앙값은 "+ avg);
	}

}
