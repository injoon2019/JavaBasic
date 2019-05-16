import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Arrays;
import java.io.IOException;

class SimpleTxtWriteRead{
	public static void main(String[] argS) throws IOException{
		Path fp = Paths.get("C:\\JavaStudy\\simple.txt");
		String st1 = "One Simple String";
		String st2 = "Two Simple String";
		List<String> lst1 = Arrays.asList(st1, st2);

		Files.write(fp,lst1);	//���Ͽ� ���ڿ� �����ϱ�
		List<String> lst2 = Files.readAllLines(fp);	//���Ϸκ��� ���ڿ� �б�
		System.out.println(lst2);
	}
}