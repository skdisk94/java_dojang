package unfinished;

public class MultiplicationWithoutSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numArray[]= {2,6,4,7};
		int numMultiArray[]= new int [numArray.length];
		int numMulti = 1;
		
		for(int i=0;i<numArray.length;i++) {
			for(int k=0;k<numArray.length;k++) {
				if(i!=k) {
					numMulti*=numArray[k];
				}
			}
			numMultiArray[i]=numMulti;
			numMulti=1;
			System.out.print(numMultiArray[i]+" ");
		}
	}

}
