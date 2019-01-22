package coding1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int num;
		int num1=0;
		String numString2="";
		
		for(a=10;a<1000;a++) {
			for(b=10;b<1000;b++) {
				num=a*b;
				String numString1 = Integer.toString(num);
				for(int i=numString1.length()-1;i>=0;i--) {
					numString2+=numString1.charAt(i);
				}
				if(numString1.equals(numString2)) {
					if(num1<num)
						num1=num;
				}
				numString2="";
			}
		}
		System.out.println(num1);
	}
}
