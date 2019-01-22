package coding1;

public class SpecialSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int []n = {-1, 1, 3, -2, 2};
		 int temp;
		 for(int j=0;j<n.length;j++) {
			 for(int i=0; i<n.length-j-1;i++) {
				if(n[i]>0&& n[i+1]<=0) {
					temp = n[i];
					n[i]=n[i+1];
					n[i+1]=temp;
				}
			 }
		 }
		 for(int i=0; i<n.length;i++) {
			 System.out.print(n[i]+",");
		 }
	}

}
