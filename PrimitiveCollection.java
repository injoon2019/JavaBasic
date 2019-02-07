import java.util.Iterator;
import java.util.LinkedList;

class PrimitiveCollection{
	public static void main(String[] args){
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10); list.add(20); list.add(30);	//¿ÀÅä ¹Ú½Ì

		int n;
		for(Iterator<Integer> itr = list.iterator(); itr.hasNext();){
			n = itr.next();	//¿ÀÅä ¾ğ¹Ú½Ì
			System.out.print(n+"\t");
		}
		System.out.println();
	}
}