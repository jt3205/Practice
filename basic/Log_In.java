import java.util.*;

public class Log_In {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> hash = new HashMap<String, String>();
		
		String userSt;
		String userSt2;
		String userSt3;
		while (true) {
			System.out.println("1. 회원가입 2. 로그인");
			int user = scanner.nextInt();
			if (user == 1) {
				while (true) {
					System.out.println("아이디 입력");
					userSt = scanner.next();
					System.out.println("비밀번호 입력");
					userSt2 = scanner.next();
					System.out.println("비밀번호 확인");
					userSt3 = scanner.next();
					if (userSt2.equals(userSt3)) {
						System.out.println("회원가입 완료");
						hash.put(userSt, userSt2);
						break;
					} else {
						System.out.println("비밀번호 불일치 다시입력하세요.");
					}
				}
			} else if (user == 2) {
				System.out.println("아이디 입력");
				userSt = scanner.next();
				System.out.println("비밀번호 입력");
				userSt2 = scanner.next();
				String get = hash.get(userSt);
				if (userSt2.equals(get)) {
					System.out.println("로그인 성공");
					break;
				}
				else{
					System.out.println("로그인 실패");
				}
			}
		}

	}

}
