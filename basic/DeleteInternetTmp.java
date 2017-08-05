import java.io.File;

public class DeleteInternetTmp {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\OrOl\\AppData\\Local\\Microsoft\\Windows\\Temporary Internet Files");
		File sub[] = f.listFiles();
		long delByte = 0;
		int cnt = 0;
		for(int i = 0;i<sub.length;i++){
			long size = sub[i].length();
			sub[i].setWritable(true, true);
			if(sub[i].delete()){
				System.out.println("삭제 완료");
				System.out.println(size+" byte");
				delByte += size;
				cnt++;
			}
			else {
				System.out.println("삭제 실패");
				System.out.println(sub[i].isFile());
			}
		}
		System.out.println("총 "+cnt+"개의 파일, 약 "+delByte/1000000+"MB 삭제");
		
	}

}
