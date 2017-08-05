import java.util.*;

public class SungHoon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int []array = new int[10];
		int i = 0;
		while(i<10){
			array[i] = i+1;
			System.out.print(array[i]+"\t");
			i++;
			if(i == 5)
				System.out.println();
		}
	}

}
