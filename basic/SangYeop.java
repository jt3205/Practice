import java.util.*;

public class SangYeop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pp1 = 3;
		int pp2 = 3;
		int user;
		while (true) {
			while (true) {
				System.out.println("��ų���� 1 ��ų���� 2");
				user = scanner.nextInt();
				if (user == 1 && pp1 == 0) {
					System.out.println("PP������ �ٸ��� ������");
					continue;
				} else if (user == 2 && pp2 == 0) {
					System.out.println("PP����į �ٸ��Ž�");
					continue;
				}
				if (user == 1) {
					System.out.println("��ų1 �ߵ�");
					System.out.println("������");
					pp1--;
					break;
				} else if (user == 2) {
					System.out.println("��ų2 �ߵ�");
					System.out.println("������");
					pp2--;
					break;
				}
			}

		}
	}

}
