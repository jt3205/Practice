import java.util.*;

public class Log_In {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> hash = new HashMap<String, String>();
		
		String userSt;
		String userSt2;
		String userSt3;
		while (true) {
			System.out.println("1. ȸ������ 2. �α���");
			int user = scanner.nextInt();
			if (user == 1) {
				while (true) {
					System.out.println("���̵� �Է�");
					userSt = scanner.next();
					System.out.println("��й�ȣ �Է�");
					userSt2 = scanner.next();
					System.out.println("��й�ȣ Ȯ��");
					userSt3 = scanner.next();
					if (userSt2.equals(userSt3)) {
						System.out.println("ȸ������ �Ϸ�");
						hash.put(userSt, userSt2);
						break;
					} else {
						System.out.println("��й�ȣ ����ġ �ٽ��Է��ϼ���.");
					}
				}
			} else if (user == 2) {
				System.out.println("���̵� �Է�");
				userSt = scanner.next();
				System.out.println("��й�ȣ �Է�");
				userSt2 = scanner.next();
				String get = hash.get(userSt);
				if (userSt2.equals(get)) {
					System.out.println("�α��� ����");
					break;
				}
				else{
					System.out.println("�α��� ����");
				}
			}
		}

	}

}
