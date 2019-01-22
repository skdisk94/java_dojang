package coding1;

public class FindOddEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {3, 4, 5, 6, 7};
		int oddNum=0;
		int evenNum=0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0)
				evenNum++;
			else
				oddNum++;
		}
		System.out.println("È¦¼ö : "+oddNum+"°³");
		System.out.println("Â¦¼ö : "+evenNum+"°³");
		
	}

}
