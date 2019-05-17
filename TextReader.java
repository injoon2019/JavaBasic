import java.io.Reader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class TextReader{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ����: ");
		String src= sc.nextLine();

		try(Reader in = new FileReader(src)){	//���� �Է� ��Ʈ�� ����
			int ch;
			
			while(true){
				ch = in.read();	//���ڸ� �ϳ��� �д´�
				if(ch == -1)
					break;
				System.out.print((char)ch);	//���ڸ� �ϳ��� ����Ѵ�
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}