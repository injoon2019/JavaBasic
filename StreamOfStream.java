import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

class StreamOfStream{
	public static void main(String[] args){
		Stream.of(11,22,33,44)	//ex 1
			.forEach(n->System.out.print(n+"\t"));
		System.out.println();

		Stream.of("So Simple")	//ex2
			.forEach(s->System.out.print(s+"\t"));
		System.out.println();
		
		List<String> sl = Arrays.asList("Toy", "Robot", "Box");
		Stream.of(sl)	//ex 3
			.forEach(w->System.out.print(w+"\t"));
		System.out.println();
	}
}