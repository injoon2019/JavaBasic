import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

class ArrangeList2{
	public static void main(String[] args){
		List<Integer> ls = Arrays.asList(1,3,5,7,9);
		ls = new ArrayList<>(ls);
		
		Consumer<List<Integer>> c = Collections::reverse; //�޼ҵ� ����
		c.accept(ls);	//���� ���� ls�� reverse�� �״�� �����ϰ� �ȴ�
		System.out.println(ls);
	}
}
