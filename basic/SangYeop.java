import java.util.*;

public class SangYeop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pp1 = 3;
		int pp2 = 3;
		int user;
		while (true) {
			while (true) {
				System.out.println("스킬쓰기 1 스킬쓰기 2");
				user = scanner.nextInt();
				if (user == 1 && pp1 == 0) {
					System.out.println("PP부족함 다른거 쓰세요");
					continue;
				} else if (user == 2 && pp2 == 0) {
					System.out.println("PP부조캄 다른거써");
					continue;
				}
				if (user == 1) {
					System.out.println("스킬1 발동");
					System.out.println("턴종료");
					pp1--;
					break;
				} else if (user == 2) {
					System.out.println("스킬2 발동");
					System.out.println("턴종료");
					pp2--;
					break;
				}
			}

		}
	}

}
