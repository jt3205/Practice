import java.util.*;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int space = scanner.nextInt();	// 공백 수 겸 줄 수를 입력받아 초기화
		int star = 1;		// 별의 개수 제한하는 변수
		int i = 0;			// 개수를 정하는 변수와 비교당하는 변수
		
		while (space > 0) {		// 줄수가 0보다 큰 경우까지 작동
			space--;
			while (i < space) {	// 공백 수 만큼 출력하기위해 i를 비교
				System.out.print(" ");
				i++;
			}
			if (i == space) {	// i가 공백개수와 같아짐 (공백을 입력받은 만큼 출력완료)
				i = 0;			// i를 다시 사용하기위해 0으로 초기화
				while (i < star) {	// 별 개수만큼 출력하기위해 i를 비교
					System.out.print("*");
					i++;
				}
				star += 2;		// 양쪽 대칭을 이루기위해 2개씩증가
			}
			i = 0;				// i를 다시 사용하기위해 0으로 초기화
			System.out.println();
		}
	}

}
