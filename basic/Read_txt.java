import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_txt {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\������\\Desktop\\Test\\txt����.txt"));
			String s;
			while ((s = in.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
