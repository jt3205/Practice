import java.util.*;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int space = scanner.nextInt();	// ���� �� �� �� ���� �Է¹޾� �ʱ�ȭ
		int star = 1;		// ���� ���� �����ϴ� ����
		int i = 0;			// ������ ���ϴ� ������ �񱳴��ϴ� ����
		
		while (space > 0) {		// �ټ��� 0���� ū ������ �۵�
			space--;
			while (i < space) {	// ���� �� ��ŭ ����ϱ����� i�� ��
				System.out.print(" ");
				i++;
			}
			if (i == space) {	// i�� ���鰳���� ������ (������ �Է¹��� ��ŭ ��¿Ϸ�)
				i = 0;			// i�� �ٽ� ����ϱ����� 0���� �ʱ�ȭ
				while (i < star) {	// �� ������ŭ ����ϱ����� i�� ��
					System.out.print("*");
					i++;
				}
				star += 2;		// ���� ��Ī�� �̷������ 2��������
			}
			i = 0;				// i�� �ٽ� ����ϱ����� 0���� �ʱ�ȭ
			System.out.println();
		}
	}

}
