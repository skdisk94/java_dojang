package coding1;

public class TriangleDistinction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int triangle[]= {20, 40, 120};
		int sum=0;
		int largeNumber=0;
		
		if(triangle.length>3)
			System.out.println("�ﰢ���� �ƴϴ�.");
		else {
			for(int i=0;i<triangle.length;i++) {
				sum+=triangle[i];
				if(largeNumber<triangle[i]) {
					largeNumber=triangle[i];
				}
			}
			if(sum!=180)
				System.out.println("�ﰢ���� �ƴϴ�.");
			else {
				if(largeNumber>90)
					System.out.println("�а��ﰢ��");
				else if(largeNumber==90)
					System.out.println("�����ﰢ��");
				else
					System.out.println("�����ﰢ��");
				}
			}
		}
	}


