import java.io.*;
import java.net.*;
public class Socket_1 {

	public static void main(String[] args) {
		InetAddress ia = null;
		Socket soc = null;
		try {
			ia = InetAddress.getByName("000.000.00.0");
			soc = new Socket(ia, 3205);
		} catch (IOException ee) {
			System.out.println("접속 오류 : " +ee.toString());
			System.exit(-1);
		}
	}

}

