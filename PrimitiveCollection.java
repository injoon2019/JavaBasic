import java.util.Iterator;
import java.util.LinkedList;

class PrimitiveCollection{
	public static void main(String[] args){
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10); list.add(20); list.add(30);	//���� �ڽ�

		int n;
		for(Iterator<Integer> itr = list.iterator(); itr.hasNext();){
			n = itr.next();	//���� ��ڽ�
			System.out.print(n+"\t");
		}
		System.out.println();
	}
}