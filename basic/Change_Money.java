import java.util.Scanner;

public class Change_Money {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int coin[] = { 500, 100, 50, 10 };
		System.out.println("���� �Է� �ϼ���.");
		int money = scanner.nextInt();
		int money2 = money;
		for (int i = 0; i < coin.length; i++) {
			int count = 0;
			while (money / coin[i] >= 1) {
				money -= coin[i];
				count++;

				if (count >= 5)
					break;
			}
			System.out.println(coin[i] + "�� : " + count);
			if (count >= 5 && coin[i] == 10) {
				System.out.println("�Ž������� �����մϴ�");
				System.exit(0);
			}
		}

		System.out.println("= ���� ������ ���� =");

		for (int i = 0; i < coin.length; i++) {
			int count = 0;
			while (money2 / coin[i] >= 1) {
				money2 -= coin[i];
				count++;
				if (count >= 5)
					break;
			}
			System.out.println(coin[i] + "�� : " + (5 - count));
		}
	}
}
