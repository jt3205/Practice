import java.util.*;

public class rock2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String RSPcomStr = null;
		String RSPuser; // 가위바위보 변수들
		String YN; // 말해 Yes Or No!!!
		int RCPcom; // 가위바위보 컴퓨터

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
			System.out.println("가위 바위 보 중에 하나를 입력하시오\n");
			
		}
	}
}
