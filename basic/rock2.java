import java.util.*;

public class rock2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String RSPcomStr = null;
		String RSPuser; // ���������� ������
		String YN; // ���� Yes Or No!!!
		int RCPcom; // ���������� ��ǻ��

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
			System.out.println("���� ���� �� �߿� �ϳ��� �Է��Ͻÿ�\n");
			
		}
	}
}
