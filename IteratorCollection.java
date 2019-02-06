import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

class IteratorCollection{
	public static void main(String[] args){
		List<String> list = new LinkedList<>();
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");

		Iterator<String> itr = list.iterator();	//반복자 처음 획득
		
		//반복자를 이용한 순차적 참조
		while(itr.hasNext())
			System.out.print(itr.next() +'\t');
		System.out.println();
		
		itr = list.iterator();	//다시 획득

		//모든 "Box"삭제

		String str;
		while(itr.hasNext()){
			str = itr.next();
			if(str.equals("Box"))
				itr.remove();
		}
		itr=list.iterator();		//다시 획득

		//결과확인
		while(itr.hasNext())
			System.out.print(itr.next()+'\t');
		System.out.println();
	}
}