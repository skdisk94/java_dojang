package coding1;

public class TheSumOfSquaredSquaredDifferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1=0;//���� ����
		int sum2=0;//������ ��
		int x;
		int y=100;
		
		for(int i=1;i<=y;i++) {
			sum1+=i;
		}
		sum1=(int) Math.pow(sum1, 2);
		for(int i=1;i<=y;i++) {
			sum2+=Math.pow(i,2);
		}
		System.out.println("���� ���� = "+sum1);
		System.out.println("������ �� = "+sum2);
		
		x=sum1-sum2;
		System.out.println("�������� - ������ �� = "+x);
	}

}
