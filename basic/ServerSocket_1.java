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
			System.out.println("해당 포트가 열려 있습니다.");
			System.exit(-1);
		}
		
		try {
			soc = ss.accept();	//클라로부터 들어오는 정보를 기다림
			System.out.println("접속자 정보 : " + soc.toString());
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			int sum = 0;
			while(true){
				String str = in.readLine();
				System.out.println("전송된 내용 : "+str);
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
