import java.util.*;

public class MiniGameLauncher {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int game; // 게임선택 값

		String RSPcomStr = null;
		String RSPuser; // 가위바위보 변수들
		String YN; // 말해 Yes Or No!!!
		int RCPcom; // 가위바위보 컴퓨터
		while (true) {
			System.out.println("Mini Game Launcher . By Jn");
			System.out.println("가위바위보 (1) , Guessing Game (2) , 숫자야구 (3)");
			game = scanner.nextInt(); // 게임종류 선택

			while (true) {
				if (game == 1) { // 가위바위보
					while (true) {
						System.out.println("가위 바위 보!");
						RSPuser = scanner.next();

						RCPcom = (int) (Math.random() * 3 + 1);
						if (RCPcom == 1) {
							RSPcomStr = "바위";
						} else if (RCPcom == 2) {
							RSPcomStr = "가위";
						} else if (RCPcom == 3) {
							RSPcomStr = "보";
						} // 컴퓨터 값 설정

						if (RSPcomStr.equals(RSPuser)) {
							System.out.println("컴퓨터 " + RSPcomStr + "! 비겼습니다.");
						} // 비김
						else if (RSPcomStr.equals("주먹") && RSPuser.equals("가위")) {
							System.out.println("컴퓨터 " + RSPcomStr + "! 졌습니다.");
						} else if (RSPcomStr.equals("가위") && RSPuser.equals("보")) {
							System.out.println("컴퓨터 " + RSPcomStr + "! 졌습니다.");
						} else if (RSPcomStr.equals("보") && RSPuser.equals("주먹")) {
							System.out.println("컴퓨터 " + RSPcomStr + "! 졌습니다.");
						} // 짐

						else if (RSPcomStr.equals("주먹") && RSPuser.equals("가위")) {
							System.out.println("컴퓨터 " + RSPcomStr + "! 이겼습니다.");
						} else if (RSPcomStr.equals("가위") && RSPuser.equals("보")) {
							System.out.println("컴퓨터 " + RSPcomStr + "! 이겼습니다.");
						} else if (RSPcomStr.equals("보") && RSPuser.equals("주먹")) {
							System.out.println("컴퓨터 " + RSPcomStr + "! 이겼습니다.");
						} // 이김
						else {
							System.out.println("가위 바위 보 중에하나를 입력하시오\n");
							continue;
						}
						System.out.println("다시 하시겠습니까? Y/N");
						YN = scanner.next();
						if (YN == "Y") {
							continue;
						} else if (YN == "N") {
							break;
						}
					}
				} else if (game == 2) { // Guessing Game

				} else if (game == 3) { // 숫자야구

				} else {
					System.out.println("세가지 게임중 하나를 골라주세요.");
				}
				System.out.println("메인으로 돌아갈까요? Y/N");
				YN = scanner.next();
				if (YN == "Y") {
					continue;
				} else if (YN == "N") {
					System.out.println("프로그램을 종료합니다.");
				}
			}
			
		}

	}
}
