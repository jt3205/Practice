import java.util.*;
public class Vect {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		int i = 0;
		int user = 1;
		while(user != 0){
			System.out.print("���� �Է�>>");
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
		iter = v.iterator();	// ������ iter �ȿ� ������ �� �Ἥ �� �־���ߵ�?
		while(iter.hasNext()){
			int n = iter.next();
			System.out.println(n);
		}
	}

}
