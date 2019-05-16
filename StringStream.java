import java.util.Arrays;
import java.util.stream.Stream;

class StringStream{
	public static void main(String[] args){
		String[] names={"Yoon", "Lee", "Park"};
		Stream<String> stm = Arrays.stream(names);	//스트림 생성
		stm.forEach(s -> System.out.println(s));	//최종 연산 진행
	}
}