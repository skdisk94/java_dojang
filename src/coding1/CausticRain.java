package coding1;

public class CausticRain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 10;
		int performance=150;
		int partArray[] = {30, 70, 15, 40, 65};
		double causticrain=0;
		double maxCausticrain=0;
		
		int temp;
		for(int i=0;i<partArray.length;i++) {
			for(int j=i;j<partArray.length-1;j++) {
				if(partArray[j]<partArray[j+1]) {
					temp = partArray[j];
					partArray[j]=partArray[j+1];
					partArray[j+1]=temp;
				}
			}
		}
		for(int i=0;i<partArray.length;i++) {
			performance+=partArray[i];
			causticrain=(double) performance/(price+3*(i+1));
			if(maxCausticrain<causticrain) {
				maxCausticrain=causticrain;
			}
		}
		System.out.println("최대 가성비는 "+(int)maxCausticrain);
	}

}
