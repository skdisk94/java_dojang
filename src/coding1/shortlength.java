package coding1;

public class shortlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []s= {1, 3, 4, 8, 13, 17, 20};
		int a=0;
		int b=0;
		int length;
		int min=999999999;
		
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length-1;j++) {
				length=Math.abs(s[i]-s[j]);
				if(min>length) {
					min=length;
					a=s[i];
					b=s[j];
				}
			}
		}
		System.out.println("("+a+","+b+")");
	}

}
