package coding1;

public class self_number {//level2 ¹Ì¿Ï

	public static void main(String[] args) {
		int[] array = new int[5000];
		for(int i=1;i<5000;i++) {
			int a=generator(i);
			array[a]=a;
		}
		for(int i=1;i<5000;i++) {
			if(array[i]==0)
				System.out.println(i);
		}
	}
	public static int generator(int a) {
		int sum=0;
		String strNum = Integer.toString(a);
		for(int i=0;i<strNum.length();i++) {
			sum+=(int)strNum.charAt(i)-48;
		}
		sum+=a;
		return sum;		
	}
}
