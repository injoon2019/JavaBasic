import java.io.Writer;
import java.io.FileWriter;
import java.io.IOException;

class SimpleWriter{
	public static void main(String[] args){
		try(Writer out= new FileWriter("data.txt")){	//���� ��� ��Ʈ�� ����
			out.write('A');
			out.write('��');	
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}