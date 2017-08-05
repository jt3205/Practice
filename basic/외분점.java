import java.util.*;

public class 외분점 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점 A의 좌표를 입력해주세요.");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();

		System.out.println("점 B의 좌표를 입력해주세요.");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
	
		System.out.println("선분 AB를 외분할 m:n 을 입력해주세요");
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		System.out.println("외분점 : ("+getPoint(x1,x2,m,n)+","+getPoint(y1, y2, m, n)+")");
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
