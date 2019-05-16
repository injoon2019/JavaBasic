import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

class SimpleBinWriteRead{
	public static void main(String[] args) throws IOException{
		Path fp = Paths.get("C:\\JavaStudy\\simple.bin");

		//���� ����, ������ �����ϸ� ���� �߻�
		fp = Files.createFile(fp);

		byte buf1[] = {0x13, 0x14, 0x15};	//���Ͽ� �� ������

		for(byte b : buf1)	//������ �������� ����� ���� �ݺ���
			System.out.print(b+"\t");
		System.out.println();

		//���Ͽ� ������ ����
		Files.write(fp, buf1, StandardOpenOption.APPEND);

		//���Ϸκ��� ������ �б�
		byte buf2[] = Files.readAllBytes(fp);

		for(byte b: buf2)	//�о� ���� �������� ����� ���� �ݺ���
			System.out.print(b+"\t");
		System.out.println();
	}
}