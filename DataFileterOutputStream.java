import java.io.IOException;
import java.io.FileOutputStream;
import java.io.DataOutputStream;

class DataFilterOutputStream{
	public static void main(String[] args){
		try(DataOutputStream out = new DataOutputStream(new FileOutputStream("data.dat"))){
			out.writeInt(370);	//int�� ������ ����
			out.writeDouble(3.14);	//double�� ������ ����
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}