import java.util.*;

public class Rock {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String user;
		int random;
		int rsp = 0;
		int comwin = 0;
		int userwin = 0;

		System.out.println("컴퓨터와 가위바위보 삼세판!");

		for (int i = 0; i < 3;) {
			random = (int) (Math.random() * 3) + 1;
			user = scanner.next();
			if (user.equals("바위")) {
				rsp = 1;
			} else if (user.equals("가위")) {
				rsp = 2;
			} else if (user.equals("보")) {
				rsp = 3;
			}
			if (random == rsp) {
				if (random == 1) {
					System.out.println("컴퓨터 : 바위!\n무승부. 다시!");
				} else if (random == 2) {
					System.out.println("컴퓨터 : 가위!\n무승부. 다시!");
				} else {
					System.out.println("컴퓨터 : 보!\n무승부. 다시!");
				}
			} else if (random == 3) {
				if (rsp == 1) {
					System.out.println("컴퓨터 : 보!\n패배..");
					++i;
					++comwin;
				} else if (rsp == 2) {
					System.out.println("컴퓨터 : 보!\n승리!");
					++i;
					++userwin;
				}
			} else if (random == 2) {
				if (rsp == 1) {
					System.out.println("컴퓨터 : 가위!\n승리!");
					++i;
					++userwin;
				} else if (rsp == 3) {
					System.out.println("컴퓨터 : 가위!\n패배!");
					++i;
					++comwin;
				}
			}
			if (random == 1) {
				if (rsp == 2) {
					System.out.println("컴퓨터 : 주먹!\n패배!");
					++i;
					++comwin;
				} else if (rsp == 3) {
					System.out.println("컴퓨터 : 주먹!\n승리!");
					++i;
					++userwin;
				}
			}

		}
		if (comwin > userwin) {
			System.out.println(comwin + " 대 " + userwin + " 으로 컴퓨터 승!");
		} else {
			System.out.println(userwin + " 대 " + comwin + " 으로 사용자 승!");
		}

	}

}
