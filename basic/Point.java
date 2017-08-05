import java.util.*;

public class Point {

	private int x; //x값 필드
	private int y;//y값 필드
	
	//모든 필드를 초기화하는 생성자
	Point(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public static String toString(Point p)
	{
		String returnStr = ("(" + p.x +"," + p.y +")");
		return returnStr;
	}

	public static void main(String[] args) {

		Vector<Point> v = new Vector<Point>();
		
		Point point[] = {new Point(2,3), new Point(-1,3), new Point(5,7),new Point(6,9)};
		
		for(int i=0;i<point.length;i++)
		{
			v.add(point[i]);
			System.out.println(toString(point[i]));
		}

	}

}
