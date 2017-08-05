import java.util.*;
public class Vect {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		int i = 0;
		int user = 1;
		while(user != 0){
			System.out.print("정수 입력>>");
			user = scanner.nextInt();
			v.add(user);
			i++;
			System.out.println();
		}
		System.out.println(v.size());
		i = 0;
		Iterator<Integer> iter = v.iterator();
		while(iter.hasNext()){
			int n = iter.next();
			System.out.println(n);
		}
		iter = v.iterator();	// 위에서 iter 안에 들은걸 다 써서 또 넣어줘야됨?
		while(iter.hasNext()){
			int n = iter.next();
			System.out.println(n);
		}
	}

}
