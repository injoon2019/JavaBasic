import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Write7ToFile{
	public static void main(String[] ars) throws IOException{
		OutputStream out = new FileOutputStream("data.dat");	//��� ��Ʈ�� ����
		out.write(7);	//7�� ����
		out.close();	//��Ʈ�� ����
	}
}