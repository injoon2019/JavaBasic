import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class StringBinarySearch{
	public static void main(String[] args){
		List<String> list = new ArrayList<>();
		list.add("Box");
		list.add("Robot");
		list.add("Apple");
		
		Collections.sort(list);
		int idx = Collections.binarySearch(list, "Robot");		
		System.out.println(list.get(idx));	//탐색의 결과 출력
	}
}