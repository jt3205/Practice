import java.util.*;

public class Rock {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String user;
		int random;
		int rsp = 0;
		int comwin = 0;
		int userwin = 0;

		System.out.println("��ǻ�Ϳ� ���������� �＼��!");

		for (int i = 0; i < 3;) {
			random = (int) (Math.random() * 3) + 1;
			user = scanner.next();
			if (user.equals("����")) {
				rsp = 1;
			} else if (user.equals("����")) {
				rsp = 2;
			} else if (user.equals("��")) {
				rsp = 3;
			}
			if (random == rsp) {
				if (random == 1) {
					System.out.println("��ǻ�� : ����!\n���º�. �ٽ�!");
				} else if (random == 2) {
					System.out.println("��ǻ�� : ����!\n���º�. �ٽ�!");
				} else {
					System.out.println("��ǻ�� : ��!\n���º�. �ٽ�!");
				}
			} else if (random == 3) {
				if (rsp == 1) {
					System.out.println("��ǻ�� : ��!\n�й�..");
					++i;
					++comwin;
				} else if (rsp == 2) {
					System.out.println("��ǻ�� : ��!\n�¸�!");
					++i;
					++userwin;
				}
			} else if (random == 2) {
				if (rsp == 1) {
					System.out.println("��ǻ�� : ����!\n�¸�!");
					++i;
					++userwin;
				} else if (rsp == 3) {
					System.out.println("��ǻ�� : ����!\n�й�!");
					++i;
					++comwin;
				}
			}
			if (random == 1) {
				if (rsp == 2) {
					System.out.println("��ǻ�� : �ָ�!\n�й�!");
					++i;
					++comwin;
				} else if (rsp == 3) {
					System.out.println("��ǻ�� : �ָ�!\n�¸�!");
					++i;
					++userwin;
				}
			}

		}
		if (comwin > userwin) {
			System.out.println(comwin + " �� " + userwin + " ���� ��ǻ�� ��!");
		} else {
			System.out.println(userwin + " �� " + comwin + " ���� ����� ��!");
		}

	}

}
