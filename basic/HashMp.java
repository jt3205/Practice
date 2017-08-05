import java.util.*;
public class HashMp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> hash = new HashMap<String,String>();
		hash.put("책1", "1");
		hash.put("책2", "2");
		hash.put("책3", "3");
		hash.put("책4", "4");
		Set<String> key = hash.keySet();
		System.out.println("검색하세요");
		String user = scanner.next();
		String a = hash.get(user);
		System.out.println(a);
	}

}
