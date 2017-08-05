import java.io.*;
import java.net.*;
public class ServerSocket_1 {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket soc = null;
		
		try {
			ss = new ServerSocket(3242);
			System.out.println("Server Ready...");
		} catch (IOException e) {
			System.out.println("�ش� ��Ʈ�� ���� �ֽ��ϴ�.");
			System.exit(-1);
		}
		
		try {
			soc = ss.accept();	//Ŭ��κ��� ������ ������ ��ٸ�
			System.out.println("������ ���� : " + soc.toString());
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			int sum = 0;
			while(true){
				String str = in.readLine();
				System.out.println("���۵� ���� : "+str);
				int user = Integer.parseInt(str);
				sum += user;
				System.out.println(sum);
				if(str.equals("0"))
					break;
			}
			
			soc.close();
		} catch (IOException ee) {}
	}

}
