import java.util.List;
import java.util.LinkedList;

class EnhancedForCollection{
	public static void main(String[] args){
		List<String> list = new LinkedList<>();

		//�ν��Ͻ� ����
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		//��ü �ν��Ͻ� ����
		for(String s: list)
			System.out.print(s + '\t');
		System.out.println();

		list.remove(0);		//ù ��° �ν��Ͻ� ����

		//��ü �ν��Ͻ� ����
		for(String s: list)
			System.out.print(s+'\t');
		System.out.println();
	}
}