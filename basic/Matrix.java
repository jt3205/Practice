
public class Matrix {
	public static void main(String[] args) {

		int arr1[][] = { { 1, 8, 6 }, { 3, 5, 7 }, { 2, 4, 9 } };
		int arr2[][] = { { 6, 7, 3 }, { 2, 8, 4 }, { 9, 5, 1 } };
		
		System.out.println("ÇÕ1 : "+sum(arr1));
		System.out.println("ÇÕ2 : "+sum(arr2));
		System.out.println("ÀüÃ¼ ÇÕ : "+(sum(arr1)+sum(arr2)));
		System.out.println("°ö1 : "+mul(arr1));
		System.out.println("°ö2 : "+mul(arr2));
		System.out.println("°ö1,2 ÀÇ ÇÕ: "+(mul(arr1)+mul(arr2)));
		

	}

	static int sum(int add[][]) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum += add[i][j];
			}
		}
		return sum;
	}

	static int mul(int mmul[][]){
		int mul = 1;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				mul *= mmul[i][j];
			}
		}
		return mul;
	}
}