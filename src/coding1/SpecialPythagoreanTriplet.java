package coding1;

public class SpecialPythagoreanTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int multiplication=0;
		
		for(int a=1;a<1000;a++) {
			for(int b=a+1;b<1000;b++) {
				for(int c=b+1;c<1000;c++) {
					sum=a+b+c;
					if((Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2))&&(sum==1000))
						multiplication=a*b*c;
				}
			}
		}
		System.out.println("a+b+c=1000이 되는 피타고라스 수 a, b, c의 곱은"+multiplication);
	}

}
