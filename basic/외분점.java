import java.util.*;

public class �ܺ��� {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� A�� ��ǥ�� �Է����ּ���.");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();

		System.out.println("�� B�� ��ǥ�� �Է����ּ���.");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
	
		System.out.println("���� AB�� �ܺ��� m:n �� �Է����ּ���");
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		System.out.println("�ܺ��� : ("+getPoint(x1,x2,m,n)+","+getPoint(y1, y2, m, n)+")");
	}
	
	static int getPoint(int p1 , int p2 , int m , int n){
		if(m>n){
			return (p2*m) - (p1*n) / (m-n);
		}
		else if(m<n){
			return (p1*n) - (p2*m) / (n-m);
		}
		return 0;
	}
}
