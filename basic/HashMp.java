import java.util.*;
public class HashMp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> hash = new HashMap<String,String>();
		hash.put("å1", "1");
		hash.put("å2", "2");
		hash.put("å3", "3");
		hash.put("å4", "4");
		Set<String> key = hash.keySet();
		System.out.println("�˻��ϼ���");
		String user = scanner.next();
		String a = hash.get(user);
		System.out.println(a);
	}

}
