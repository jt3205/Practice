import java.util.*;

public class MiniGameLauncher {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int game; // ���Ӽ��� ��

		String RSPcomStr = null;
		String RSPuser; // ���������� ������
		String YN; // ���� Yes Or No!!!
		int RCPcom; // ���������� ��ǻ��
		while (true) {
			System.out.println("Mini Game Launcher . By Jn");
			System.out.println("���������� (1) , Guessing Game (2) , ���ھ߱� (3)");
			game = scanner.nextInt(); // �������� ����

			while (true) {
				if (game == 1) { // ����������
					while (true) {
						System.out.println("���� ���� ��!");
						RSPuser = scanner.next();

						RCPcom = (int) (Math.random() * 3 + 1);
						if (RCPcom == 1) {
							RSPcomStr = "����";
						} else if (RCPcom == 2) {
							RSPcomStr = "����";
						} else if (RCPcom == 3) {
							RSPcomStr = "��";
						} // ��ǻ�� �� ����

						if (RSPcomStr.equals(RSPuser)) {
							System.out.println("��ǻ�� " + RSPcomStr + "! �����ϴ�.");
						} // ���
						else if (RSPcomStr.equals("�ָ�") && RSPuser.equals("����")) {
							System.out.println("��ǻ�� " + RSPcomStr + "! �����ϴ�.");
						} else if (RSPcomStr.equals("����") && RSPuser.equals("��")) {
							System.out.println("��ǻ�� " + RSPcomStr + "! �����ϴ�.");
						} else if (RSPcomStr.equals("��") && RSPuser.equals("�ָ�")) {
							System.out.println("��ǻ�� " + RSPcomStr + "! �����ϴ�.");
						} // ��

						else if (RSPcomStr.equals("�ָ�") && RSPuser.equals("����")) {
							System.out.println("��ǻ�� " + RSPcomStr + "! �̰���ϴ�.");
						} else if (RSPcomStr.equals("����") && RSPuser.equals("��")) {
							System.out.println("��ǻ�� " + RSPcomStr + "! �̰���ϴ�.");
						} else if (RSPcomStr.equals("��") && RSPuser.equals("�ָ�")) {
							System.out.println("��ǻ�� " + RSPcomStr + "! �̰���ϴ�.");
						} // �̱�
						else {
							System.out.println("���� ���� �� �߿��ϳ��� �Է��Ͻÿ�\n");
							continue;
						}
						System.out.println("�ٽ� �Ͻðڽ��ϱ�? Y/N");
						YN = scanner.next();
						if (YN == "Y") {
							continue;
						} else if (YN == "N") {
							break;
						}
					}
				} else if (game == 2) { // Guessing Game

				} else if (game == 3) { // ���ھ߱�

				} else {
					System.out.println("������ ������ �ϳ��� ����ּ���.");
				}
				System.out.println("�������� ���ư����? Y/N");
				YN = scanner.next();
				if (YN == "Y") {
					continue;
				} else if (YN == "N") {
					System.out.println("���α׷��� �����մϴ�.");
				}
			}
			
		}

	}
}
